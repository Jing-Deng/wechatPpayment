package com.tianhong.xianlan.service;

import com.tianhong.xianlan.mapper.ThDiangongMapper;
import com.tianhong.xianlan.mapper.ThPQrcodeMapper;
import com.tianhong.xianlan.pojo.ThDiangong;
import com.tianhong.xianlan.pojo.ThPQrcode;
import com.tianhong.xianlan.utils.XMLUtils;
import com.tianhong.xianlan.utils.wxUtil.WXRefuntResult;
import com.tianhong.xianlan.utils.wxUtil.WxConfig;
import com.tianhong.xianlan.utils.wxUtil.WxUtil;
import com.tianhong.xianlan.vo.MsgVo;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContexts;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import javax.net.ssl.SSLContext;
import javax.servlet.http.HttpSession;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.KeyStore;
import java.util.*;

/**
 * @描述：
 * @author: DengChengJing
 * @CreateDate: 2019/2/28 10:56
 */
@Service
public class WxService {

    @Autowired
    private HttpClientService httpClientService;
    @Autowired
    private ThDiangongMapper thDiangongMapper;
    @Autowired
    private ThPQrcodeMapper thPQrcodeMapper;

    public MsgVo getOpeanid(String code, HttpSession session) {
//        httpClientService.clientGet();
        return null;
    }

    public ModelAndView qyfk(String openid, Integer id, Integer randnum) throws Exception {
        if (openid==null||id==null||randnum==null){
            return  fail("领取失败，请重试");
        }

        //1.查询此openid是否存在
      ThDiangong thDiangong= thDiangongMapper.queryByOpenId(openid);
        if (thDiangong==null){
            return  fail("你还不是电工");
        }
        //2.查看此优惠券是否使用过了
        ThPQrcode thPQrcode = thPQrcodeMapper.selectByPrimaryKey(id);
        if (thPQrcode==null){
            return fail("此红包不存在，或者已经被领取");
        }
        if (!thPQrcode.getRandnum().equals(randnum)){
           return fail("此红包异常");
        }

        if (!thPQrcode.getStatus().equals(0)){
            return fail("此红包已被领取");
        }

        //积分换算成现金
        Integer jifenAdd = thPQrcode.getJifenAdd();
        Integer addMoney=jifenAdd*10;

        TreeMap<String, String> map = new TreeMap<>();
        String appid = WxConfig.TH_APP_ID;//商户下的公众号的id
        String mch_id = WxConfig.WX_MCH_ID_191; //商户账号appid
        String nonce_str = WxUtil.getNonce(8);//随机字符串
        String partner_trade_no = String.valueOf(System.currentTimeMillis());//商户订单号

        String cert_path = WxConfig.WX_CERTPATH_191;
        String key = WxConfig.WX_KEY_191;
        map.put("nonce_str", nonce_str);
        map.put("mch_appid", appid);//商户号所绑定的应用 如这里绑定的是小程序，所以这里填小程序的appid
        map.put("mchid", mch_id);
        //商户订单号
        map.put("partner_trade_no", partner_trade_no);
        map.put("openid", thDiangong.getWxid());
        map.put("check_name", "NO_CHECK");//校验用户姓名选项 NO_CHECK：不校验真实姓名FORCE_CHECK：强校验真实姓名
        map.put("amount", addMoney.toString());//	企业付款金额，单位为分
        map.put("desc", "www.yumatianhong.com");//企业付款备注，必填。注意：备注中的敏感词会被转成字符*
        map.put("spbill_create_ip", "192.168.1.1");//该IP可传用户端或者服务端的IP。
        String sign = WxUtil.createSign("UTF-8",map,  key);//签名
        map.put("sign", sign);
        //map 转 xml
        String xmlParams = XMLUtils.mapToXml(map);
        //证书
        KeyStore keyStore = KeyStore.getInstance("PKCS12");
        InputStream instream = new WxService().getClass().getResourceAsStream(cert_path);
        try {
            keyStore.load(instream, mch_id.toCharArray());
        } finally {
            if (instream != null)
                instream.close();
        }

        SSLContext sslcontext = SSLContexts.custom().loadKeyMaterial(keyStore, mch_id.toCharArray()).build();
        SSLConnectionSocketFactory sslf = new SSLConnectionSocketFactory(sslcontext);
        CloseableHttpClient httpclient = HttpClients.custom().setSSLSocketFactory(sslf).build();
        try {

            HttpPost httpPost = new HttpPost(WxConfig.url);//企业打款接口

            StringEntity reqEntity = new StringEntity(xmlParams);
            // 设置类型
            reqEntity.setContentType("application/x-www-form-urlencoded");
            httpPost.setEntity(reqEntity);
            CloseableHttpResponse response = httpclient.execute(httpPost);
            try {
                HttpEntity entity = response.getEntity();
                String xmlParam = "";
                if (entity != null) {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(entity.getContent(), "UTF-8"));
                    String line;
                    while ((line = bufferedReader.readLine()) != null) {
                        xmlParam += line;
                    }
                }
                EntityUtils.consume(entity);
                return resultMoney(WxUtil.fundResult(xmlParam),thDiangong,thPQrcode);
            } finally {
                response.close();
            }
        } finally {
            httpclient.close();
        }

    }

    private ModelAndView resultMoney(WXRefuntResult fundResult, ThDiangong thDiangong, ThPQrcode thPQrcode) {
        Map<String,Object> map=new HashMap<>();
        map.put("money",thPQrcode.getJifenAdd()/10.0);
        if ("SUCCESS".equals(fundResult.getReturn_code())&&"SUCCESS".equals(fundResult.getResult_code())){
            thPQrcode.setStatus(1);
            thPQrcode.setCreatetime(String.valueOf(new Date().getTime()));
            thPQrcode.setScanDiangong(thDiangong.getDgName());
            thPQrcode.setCate(1);
            thPQrcodeMapper.updateByPrimaryKey(thPQrcode);
            map.put("msg","领取成功");
            return  new ModelAndView("com/ThQrcodelist/success",map);
        }
        map.put("msg","失败"+fundResult.getReturn_msg());
        return    new ModelAndView("com/ThQrcodelist/fail",map);

    }


    private  ModelAndView fail(String msg){
        Map<String,String> map=new HashMap<>();
        map.put("msg",msg);
        return  new ModelAndView("com/ThQrcodelist/fail",map);
    }
}
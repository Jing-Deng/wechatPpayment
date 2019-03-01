package com.tianhong.xianlan.utils.wxUtil;

import com.tianhong.xianlan.utils.Md5Encrypt;

import java.util.*;

/**
 * @描述：
 * @author: DengChengJing
 * @CreateDate: 2019/2/28 14:42
 */
public class WxUtil {

    public static final String  CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";//字符串


    /**
     * 微信退款是获取签名算法
     * @param params
     * @param privateKey
     * @return
     */
    public static String createSign(Map<String, String> params, String privateKey){
        StringBuilder sb = new StringBuilder();
        // 将参数以参数名的字典升序排序
        Map<String, String> sortParams = new TreeMap<String, String>(params);
        // 遍历排序的字典,并拼接"key=value"格式
        for (Map.Entry<String, String> entry : sortParams.entrySet()) {
            String key = entry.getKey();
            String value =  entry.getValue().trim();
            if (isNotEmpty(value))
                sb.append("&").append(key).append("=").append(value);
        }
        String stringA = sb.toString().replaceFirst("&","");
        System.out.println("生成字符串："+stringA);
        String stringSignTemp = stringA + privateKey;
        System.out.println("连接商户key："+stringSignTemp);

        String signValue = Md5Encrypt.md5(stringSignTemp);
        return signValue;
    }


    public static String createSign(String characterEncoding, SortedMap<String,String> parameters,String api_key){
        StringBuffer sb = new StringBuffer();
        Set es = parameters.entrySet();
        Iterator it = es.iterator();
        while(it.hasNext()) {
            Map.Entry entry = (Map.Entry)it.next();
            String k = (String)entry.getKey();
            Object v = entry.getValue();
            if(null != v && !"".equals(v)
                    && !"sign".equals(k) && !"key".equals(k)) {
                sb.append(k + "=" + v + "&");
            }
        }
        sb.append("key=" + api_key);
        String sign = MD5Util.MD5Encode(sb.toString(), characterEncoding).toUpperCase();
        return sign;
    }

    /**
     * 判断字符串不为空
     * @param str
     * @return
     */
    public static boolean isNotEmpty(String str) {
        if(str==null||str.trim().equals(""))
            return false;
        return true;
    }

    /**
     * 获取随机字符串
     * @param Number 位数
     * @return
     */
    public static String getNonce(Integer Number) {
        Random random = new Random();
        char[] text = new char[Number];
        for (int i = 0; i < Number; i++) {
            text[i] = CHARACTERS.charAt(random.nextInt(CHARACTERS.length()));
        }
        return new String(text);
    }
    /**
     * 退款结果处理
     * @param xmlParam
     * @return
     */
    public static WXRefuntResult fundResult(String xmlParam){
        if(xmlParam==null || xmlParam.trim().equals(""))
            return null;
        WXRefuntResult refuntResult = new WXRefuntResult();
        String[] result = xmlParam.split("return_code");
        String return_code = result[1];
        return_code = return_code.substring("><![CDATA[".length());
        return_code = return_code.substring(0, return_code.indexOf("]]"));
        String return_msg = result[2];
        return_msg = return_msg.substring("><return_msg><![CDATA[".length());
        return_msg = return_msg.substring(0, return_msg.indexOf("]]"));
        refuntResult.setReturn_code(return_code);
        refuntResult.setReturn_msg(return_msg);
        if("FAIL".equals(return_code)) return refuntResult;

        String[] result2 = result[2].split("result_code");
        String result_code = result2[1];
        result_code = result_code.substring("><![CDATA[".length());
        result_code = result_code.substring(0, result_code.indexOf("]]"));
        refuntResult.setResult_code(result_code);
        if("SUCCESS".equals(result_code)) return refuntResult;

        String[] result3 = result[2].split("err_code_des");
        String err_code_des = result3[1];
        err_code_des = err_code_des.substring("><![CDATA[".length());
        err_code_des = err_code_des.substring(0, err_code_des.indexOf("]]"));
        refuntResult.setErr_code_des(err_code_des);

        return refuntResult;

    }
}

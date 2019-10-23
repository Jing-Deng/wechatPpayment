package com.tianhong.xianlan.service;

import com.tianhong.xianlan.mapper.ThQrcodelistMapper;
import com.tianhong.xianlan.utils.Msg;
import com.tianhong.xianlan.vo.MsgVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * @描述：
 * @author: DengChengJing
 * @CreateDate: 2019/2/28 10:10
 */
@Service
public class ThQrcodelistService {

    @Autowired
    private ThQrcodelistMapper thQrcodelistMapper;


    public ModelAndView getQrcode(Integer id, Integer randnum, String openid, HttpSession session, Map<String, Object> map) {
        if (openid==null||"".equals(openid)){
            System.out.println("openid是空的");
        }
        System.out.println(openid+"：openid");
        session.setAttribute("openid",openid);
        System.out.println(id+"|"+randnum);

        //1.判断是否是微信客户端使用

        //2.判断是否是微信已经登录了opeanid

        //2.判断是否是电工
        //a.通过opeanid查看电工表中的电工数据是否存在，存在就返回并显示
        //b.不存在就显示注册电工界面


        //3.判断是否使用过这个券

    map.put("msg","错误页面");
    map.put("url","www.baidu.com");
    return  new ModelAndView("com/ThQrcodelist/list",map);
    }



}

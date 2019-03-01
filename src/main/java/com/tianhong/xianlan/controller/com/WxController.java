package com.tianhong.xianlan.controller.com;

import com.tianhong.xianlan.service.WxService;
import com.tianhong.xianlan.utils.Msg;
import com.tianhong.xianlan.utils.wxUtil.WXRefuntResult;
import com.tianhong.xianlan.vo.MsgVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.crypto.MacSpi;
import javax.servlet.http.HttpSession;

/**
 * @描述：
 * @author: DengChengJing
 * @CreateDate: 2019/2/28 10:55
 */
@Controller
@RequestMapping("/wx")
public class WxController {

    @Autowired
    private WxService wxService;

    @PostMapping("/getOpeanid")
    public MsgVo getOpeanid(@RequestParam(name = "code", required = true) String code, HttpSession session) {
        return wxService.getOpeanid(code, session);
    }

    @GetMapping("/qyfk/{id}/{randnum}/{openid}")
    public ModelAndView qyfk(@PathVariable(name = "openid")String openid, @PathVariable(name = "id")Integer id, @PathVariable(name = "randnum")Integer randnum) throws  Exception{
        return wxService.qyfk(openid,id,randnum);
    }


}

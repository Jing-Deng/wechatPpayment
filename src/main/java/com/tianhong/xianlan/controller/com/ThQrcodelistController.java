package com.tianhong.xianlan.controller.com;

import com.tianhong.xianlan.service.ThQrcodelistService;
import com.tianhong.xianlan.vo.MsgVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.Map;


/**
 * @描述：
 * @author: DengChengJing
 * @CreateDate: 2019/2/28 10:05
 */
@RestController
@RequestMapping("/com")
public class ThQrcodelistController {

    @Autowired
    private ThQrcodelistService thQrcodelistService;

    @GetMapping("/getQrcode/{id}/{randnum}/{openid}")
    public ModelAndView getQrcode(@PathVariable(name = "id", required = false) Integer id, @PathVariable(name = "randnum", required = false) Integer randnum, @PathVariable(name = "openid") String openid, HttpSession session, Map<String, Object> map) {
        return thQrcodelistService.getQrcode(id, randnum, openid, session,map);
    }

}

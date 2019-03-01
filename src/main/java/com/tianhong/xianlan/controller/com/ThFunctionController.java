package com.tianhong.xianlan.controller.com;

import com.tianhong.xianlan.service.ThFunctionService;
import com.tianhong.xianlan.vo.MsgVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/com/func")
public class ThFunctionController {

    @Autowired
    private ThFunctionService thFunctionService;

    @GetMapping("/funtionDo/{stata}")
    public MsgVo funtionDo(@PathVariable(name = "stata")Integer stata){
        return thFunctionService.funtionDo(stata);
    }

}

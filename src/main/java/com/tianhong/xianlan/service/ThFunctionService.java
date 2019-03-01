package com.tianhong.xianlan.service;

import com.tianhong.xianlan.enums.ThFunctionEnum;
import com.tianhong.xianlan.mapper.ThFunctionMapper;
import com.tianhong.xianlan.pojo.ThFunction;
import com.tianhong.xianlan.utils.Msg;
import com.tianhong.xianlan.vo.MsgVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ThFunctionService {

    @Autowired
    private ThFunctionMapper thFunctionMapper;

    public MsgVo funtionDo(Integer stata) {
        if (stata==null){
            return Msg.error("失败");
        }

        if (!stata.equals(1)&&!stata.equals(0)){
            return Msg.error("参数错误:"+stata);
        }

        ThFunction thFunction = new ThFunction(ThFunctionEnum.FUNCTION_1001.getCode(), stata, null);
        int i = thFunctionMapper.updateByPrimaryKeySelective(thFunction);
        if (i==0){
            return Msg.error("更新失败");
        }
        return Msg.success();

    }
}

package com.tianhong.xianlan.utils;


import com.tianhong.xianlan.vo.MsgVo;

public class Msg {
    public static MsgVo success(Object object) {
        MsgVo resultVO = new MsgVo();
        resultVO.setData(object);
        resultVO.setCode(1);
        resultVO.setMsg("成功");
        return resultVO;
    }

    public static MsgVo success() {
        return success(null);
    }

    public static MsgVo error(Integer code, String msg) {
        MsgVo resultVO = new MsgVo();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }

    public static MsgVo error(String msg) {
        MsgVo resultVO = new MsgVo();
        resultVO.setCode(-1);
        resultVO.setMsg(msg);
        return resultVO;
    }
    public static MsgVo error(String msg,Object object) {
        MsgVo resultVO = new MsgVo();
        resultVO.setCode(-1);
        resultVO.setMsg(msg);
        resultVO.setData(object);
        return resultVO;
    }

}

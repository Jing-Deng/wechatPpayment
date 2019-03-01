package com.tianhong.xianlan.vo;

import lombok.Data;

@Data
public class MsgVo<T> {
    /**
     * 状态码
     */
    private int code;
    /**
     * 提示信息
     */
    private String msg;

    /**
     * 返回数据
     */
    private T data;
}

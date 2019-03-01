package com.tianhong.xianlan.enums;

public enum ThFunctionEnum {

    FUNCTION_1001(1001,"企业打款");

    private int code;
    private String msg;

    private ThFunctionEnum() {
    }
    private ThFunctionEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
}

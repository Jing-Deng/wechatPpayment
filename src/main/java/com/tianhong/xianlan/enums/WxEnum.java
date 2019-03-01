package com.tianhong.xianlan.enums;

public enum WxEnum {

	transfers_Url(1001,"https://api.mch.weixin.qq.com/mmpaymkttransfers/promotion/transfers");
	
	private int code;
	private String msg;

	private WxEnum() {
	}
	private WxEnum(int code, String msg) {
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

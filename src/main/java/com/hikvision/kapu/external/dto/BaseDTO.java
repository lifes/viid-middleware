package com.hikvision.kapu.external.dto;

/**
 * @author shanguoming 2016年1月15日 下午3:45:03
 * @version V1.0
 * @modify: {原因} by shanguoming 2016年1月15日 下午3:45:03
 */
public class BaseDTO {
	private Integer resultCode = 0;
	private String resultMsg;
	
	public Integer getResultCode() {
		return resultCode;
	}
	
	public void setResultCode(Integer resultCode) {
		this.resultCode = resultCode;
	}
	
	public String getResultMsg() {
		return resultMsg;
	}
	
	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
}

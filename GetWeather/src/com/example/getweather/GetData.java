package com.example.getweather;

/**
 * 请求返回的信息*/
public class GetData {
	private String resultcode;//返回码
	private String reason;//返回码解释
	private ResultEntity result;//返回结果
	private String error_code;//错误码
	public String getResultcode() {
		return resultcode;
	}
	public void setResultcode(String resultcode) {
		this.resultcode = resultcode;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public ResultEntity getResult() {
		return result;
	}
	public void setResult(ResultEntity result) {
		this.result = result;
	}
	public String getError_code() {
		return error_code;
	}
	public void setError_code(String error_code) {
		this.error_code = error_code;
	}
	
}

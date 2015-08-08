package com.example.getweather;
/**
 * 天气标示*/
public class WeatherId {
	private String fa;//天气标示1
	private String fb;//天气表示2，天气标示1与天气标示2不一致时表示组合天气
	
	public String getFa() {
		return fa;
	}
	public void setFa(String fa) {
		this.fa = fa;
	}
	public String getFb() {
		return fb;
	}
	public void setFb(String fb) {
		this.fb = fb;
	}
	
}

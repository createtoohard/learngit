package com.example.getweather;


/**
 * 未来几天内的天气情况*/
public class FutureEntity {
	private String temperature;//温度
	private String weather;//天气情况
	private WeatherId weather_id;//天气唯一标示
	private String wind;//风力方向与大小情况
	private String week;//星期几
	private String date;//日期
	
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	public String getWeather() {
		return weather;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}
	public String getWind() {
		return wind;
	}
	public void setWind(String wind) {
		this.wind = wind;
	}
	public String getWeek() {
		return week;
	}
	public void setWeek(String week) {
		this.week = week;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public WeatherId getWeather_id() {
		return weather_id;
	}
	public void setWeather_id(WeatherId weather_id) {
		this.weather_id = weather_id;
	}
	
	
	
}

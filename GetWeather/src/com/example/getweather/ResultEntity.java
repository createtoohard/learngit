package com.example.getweather;

import java.util.List;

public class ResultEntity {
	private SKEntity sk;//当前天气情况
	private TodayEntity today;//今天的天气情况
	private List<FutureEntity> future;//未来一周的天气情况
	public SKEntity getSk() {
		return sk;
	}
	public void setSk(SKEntity sk) {
		this.sk = sk;
	}
	public TodayEntity getToday() {
		return today;
	}
	public void setToday(TodayEntity today) {
		this.today = today;
	}
	public List<FutureEntity> getFuture() {
		return future;
	}
	public void setFuture(List<FutureEntity> future) {
		this.future = future;
	}

}

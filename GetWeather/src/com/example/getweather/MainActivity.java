package com.example.getweather;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.google.gson.Gson;


public class MainActivity extends Activity {
	private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.weather_btn);
        btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				SKEntity skEntity = new SKEntity();
				skEntity.setTemp("21");
				skEntity.setWind_direction("西风");
				skEntity.setWind_strength("2级");
				skEntity.setHumidity("4%");
				skEntity.setTime("14:25");
				
				TodayEntity tEntity = new TodayEntity();
				tEntity.setCity("南京");
				tEntity.setDate_y("2015年07月12日");
				tEntity.setWeek("星期日");
				tEntity.setTemperature("8℃~20℃");
				tEntity.setWeather("晴转霾");
				WeatherId weatherid = new WeatherId();
				weatherid.setFa("01");
				weatherid.setFb("53");
				tEntity.setWeather_id(weatherid);
				tEntity.setWind("西南风微风");
				tEntity.setDressing_index("较冷");
				tEntity.setDressing_advice("建议穿雨衣，打伞");
				tEntity.setUv_index("中等");
				tEntity.setComfort_index("爽");
				tEntity.setWash_index("较适宜");
				tEntity.setTravel_index("较适宜");
				tEntity.setExercise_index("较适宜");
				tEntity.setDrying_index("中等");
				
				
				List<FutureEntity> future = new ArrayList<FutureEntity>();
				//未来一周的天气的第一天
				FutureEntity fEntity1 = new FutureEntity();
				fEntity1.setTemperature("28℃~36℃");
				fEntity1.setWeather("晴转多云");
				WeatherId widf1 = new WeatherId();
				widf1.setFa("01");
				widf1.setFb("01");
				fEntity1.setWeather_id(widf1);
				fEntity1.setWind("东南风3～4级");
				fEntity1.setWeek("星期一");
				fEntity1.setDate("20150713");
				future.add(fEntity1);
				
				//未来一周的天气的第二天
				FutureEntity fEntity2 = new FutureEntity();
				fEntity2.setTemperature("28℃~36℃");
				fEntity2.setWeather("晴转多云");
				WeatherId widf2 = new WeatherId();
				widf2.setFa("01");
				widf2.setFb("01");
				fEntity2.setWeather_id(widf2);
				fEntity2.setWind("东南风3～4级");
				fEntity2.setWeek("星期二");
				fEntity2.setDate("20150714");
				future.add(fEntity2);
				
				//未来一周的天气的第三天
				FutureEntity fEntity3 = new FutureEntity();
				fEntity3.setTemperature("28℃~36℃");
				fEntity3.setWeather("晴转多云");
				WeatherId widf3 = new WeatherId();
				widf3.setFa("01");
				widf3.setFb("01");
				fEntity3.setWeather_id(widf3);
				fEntity3.setWind("东南风3～4级");
				fEntity3.setWeek("星期三");
				fEntity3.setDate("20150715");
				future.add(fEntity3);
				
				//未来一周的天气的第四天
				FutureEntity fEntity4 = new FutureEntity();
				fEntity4.setTemperature("28℃~36℃");
				fEntity4.setWeather("晴转多云");
				WeatherId widf4 = new WeatherId();
				widf4.setFa("01");
				widf4.setFb("01");
				fEntity4.setWeather_id(widf4);
				fEntity4.setWind("东南风3～4级");
				fEntity4.setWeek("星期四");
				fEntity4.setDate("20150716");
				future.add(fEntity4);
				
				//未来一周的天气的第五天
				FutureEntity fEntity5 = new FutureEntity();
				fEntity5.setTemperature("28℃~36℃");
				fEntity5.setWeather("晴转多云");
				WeatherId widf5 = new WeatherId();
				widf5.setFa("01");
				widf5.setFb("01");
				fEntity5.setWeather_id(widf5);
				fEntity5.setWind("东南风3～4级");
				fEntity5.setWeek("星期五");
				fEntity5.setDate("20150717");
				future.add(fEntity5);
				
				//未来一周的天气的第六天
				FutureEntity fEntity6 = new FutureEntity();
				fEntity6.setTemperature("28℃~36℃");
				fEntity6.setWeather("晴转多云");
				WeatherId widf6 = new WeatherId();
				widf6.setFa("01");
				widf6.setFb("01");
				fEntity6.setWeather_id(widf1);
				fEntity6.setWind("东南风3～4级");
				fEntity6.setWeek("星期六");
				fEntity6.setDate("20150718");
				future.add(fEntity6);
				
				//未来一周的天气的第七天
				FutureEntity fEntity7 = new FutureEntity();
				fEntity7.setTemperature("28℃~36℃");
				fEntity7.setWeather("晴转多云");
				WeatherId widf7 = new WeatherId();
				widf7.setFa("01");
				widf7.setFb("01");
				fEntity7.setWeather_id(widf7);	
				fEntity7.setWind("东南风3～4级");
				fEntity7.setWeek("星期日");
				fEntity7.setDate("20150719");
				future.add(fEntity7);
							
				ResultEntity result = new ResultEntity();
				result.setSk(skEntity);
				result.setToday(tEntity);
				result.setFuture(future);
										
				GetData getData = new GetData();
				getData.setResultcode("200");
				getData.setReason("请求成功");
				getData.setResult(result);
				getData.setError_code("0");
				
				//将java对象转换成JSON数据
				Gson gson = new Gson();
				String s = gson.toJson(getData);
				Log.d("parsegson", s);
				
				
				//将json数据转换成java对象
				GetData gData = gson.fromJson(s, GetData.class);
				String aa = gData.getResultcode();
				ResultEntity rEntity = gData.getResult();
				SKEntity sEntity = rEntity.getSk();
				TodayEntity todayEntity = rEntity.getToday();
				Log.d("parsegson", todayEntity.toString());
				
				List<FutureEntity> feature = rEntity.getFuture();
				for(int i=0;i<feature.size();i++){
					Log.d("parsegson",feature.get(i).getDate());
				}
				
				
				}
			
				
				
				
				
			
		});
     
    }

}

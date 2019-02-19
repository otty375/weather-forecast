package com.example.weatherforecast.service;

import com.example.weatherforecast.resource.CityEnum;
import com.example.weatherforecast.resource.WeatherForecast;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

// 演習5-1 サービスのBean定義をしよう

public class WeatherForecastServiceImpl implements WeatherForecastService {

    private final String WEATHER_URL = "http://weather.livedoor.com/forecast/webservice/json/v1?city={cityId}";

    // 演習5-3 RestTemplateをコンストラクタインジェクションしよう






    @Override
    public WeatherForecast getWeather(String city) throws Exception {
        // 演習5-2 メソッドの処理を確認しよう（編集不要）

        // リクエストパラメータからIdを取得
        String cityId = CityEnum.getCity(city.toLowerCase()).getId();
        // Idを埋め込んで天気予報APIを叩く
        WeatherForecast response = restTemplate.getForObject(WEATHER_URL, WeatherForecast.class, cityId);

        return response;
    }
}

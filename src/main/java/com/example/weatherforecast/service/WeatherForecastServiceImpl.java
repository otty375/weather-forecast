package com.example.weatherforecast.service;

import com.example.weatherforecast.CityEnum;
import com.example.weatherforecast.resource.WeatherForecast;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class WeatherForecastServiceImpl implements WeatherForecastService {

    private final String WEATHER_URL = "http://weather.livedoor.com/forecast/webservice/json/v1?city=";

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public WeatherForecast getWeather(String city) {
        // リクエストパラメータからIdを取得
        String cityId = CityEnum.valueOf(city.toUpperCase()).getId();
        // 天気予報APIを叩く
        WeatherForecast response = restTemplate.getForObject(WEATHER_URL + cityId, WeatherForecast.class);

        return response;
    }
}

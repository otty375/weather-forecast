package com.example.weatherforecast.service;

import com.example.weatherforecast.resource.CityEnum;
import com.example.weatherforecast.resource.WeatherForecast;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherForecastServiceImpl implements WeatherForecastService {

    private final String WEATHER_URL = "http://weather.livedoor.com/forecast/webservice/json/v1?city={cityId}";

    private final RestTemplate restTemplate;

    @Autowired
    public WeatherForecastServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public WeatherForecast getWeather(String city) throws Exception {
        // リクエストパラメータからIdを取得
        String cityId = CityEnum.getCity(city).getId();
        // Idを埋め込んで天気予報APIを叩く
        WeatherForecast response = restTemplate.getForObject(WEATHER_URL, WeatherForecast.class, cityId);

        return response;
    }
}

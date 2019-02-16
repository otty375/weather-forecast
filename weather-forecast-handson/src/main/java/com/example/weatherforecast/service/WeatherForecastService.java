package com.example.weatherforecast.service;

import com.example.weatherforecast.resource.WeatherForecast;

public interface WeatherForecastService {
    /**
     * 指定した地域の天気を取得する
     * @param city
     * @return
     */
    WeatherForecast getWeather(String city) throws Exception;
}

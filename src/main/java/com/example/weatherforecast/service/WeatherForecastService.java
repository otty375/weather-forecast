package com.example.weatherforecast.service;

import com.example.weatherforecast.resource.WeatherForecastDto;

public interface WeatherForecastService {
    /**
     * 指定した地域の天気を取得する
     * @param city
     * @return
     */
    WeatherForecastDto getWeather(String city);

}

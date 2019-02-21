package com.example.weatherforecast.service;

import com.example.weatherforecast.resource.CityEnum;
import com.example.weatherforecast.resource.WeatherForecast;

public interface WeatherForecastService {
    /**
     * 指定した地域の天気を取得する
     * @param city
     * @return
     */
    WeatherForecast getWeather(String city) throws Exception;

    /**
     * 都道府県の一覧を返す
     * @return
     */
    CityEnum[] getCityList();
}

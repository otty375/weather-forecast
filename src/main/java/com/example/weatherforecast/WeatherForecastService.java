package com.example.weatherforecast;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Component
public class WeatherForecastService {

    private static final String URL = "http://weather.livedoor.com/forecast/webservice/json/v1?city=";

    public WeatherForecastDto getWeather(String city) {
        RestTemplate restTemplate = new RestTemplate();
        // TODO city変換
        WeatherForecast response = restTemplate.getForObject(URL + CityEnum.TOKYO.getId(), WeatherForecast.class);

        // TODO factory
        ForecastDto todayDto = new ForecastDto(
                response.getForecasts().get(0).getTelop(),
                response.getForecasts().get(0).getDate(),
                response.getForecasts().get(0).getImage().getUrl());
        ForecastDto tomorrowDto = new ForecastDto(
                response.getForecasts().get(1).getTelop(),
                response.getForecasts().get(1).getDate(),
                response.getForecasts().get(1).getImage().getUrl());
        ForecastDto dayAfterTomorrowDto = new ForecastDto(
                response.getForecasts().get(2).getTelop(),
                response.getForecasts().get(2).getDate(),
                response.getForecasts().get(2).getImage().getUrl());

        WeatherForecastDto weatherForecastDto = new WeatherForecastDto(
                response.getTitle(), Arrays.asList(todayDto, tomorrowDto, dayAfterTomorrowDto));

        return weatherForecastDto;
    }
}

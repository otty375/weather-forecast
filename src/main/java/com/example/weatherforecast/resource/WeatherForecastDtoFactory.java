package com.example.weatherforecast.resource;

import java.util.Arrays;

public class WeatherForecastDtoFactory {

    public static WeatherForecastDto getWeatherForecastDto(WeatherForecast weatherForecast) {
        ForecastDto todayDto = new ForecastDto(
                weatherForecast.getForecasts().get(0).getTelop(),
                weatherForecast.getForecasts().get(0).getDate(),
                weatherForecast.getForecasts().get(0).getImage().getUrl());
        ForecastDto tomorrowDto = new ForecastDto(
                weatherForecast.getForecasts().get(1).getTelop(),
                weatherForecast.getForecasts().get(1).getDate(),
                weatherForecast.getForecasts().get(1).getImage().getUrl());
        ForecastDto dayAfterTomorrowDto = new ForecastDto(
                weatherForecast.getForecasts().get(2).getTelop(),
                weatherForecast.getForecasts().get(2).getDate(),
                weatherForecast.getForecasts().get(2).getImage().getUrl());

        return new WeatherForecastDto(
                weatherForecast.getTitle(),
                Arrays.asList(todayDto, tomorrowDto, dayAfterTomorrowDto));
    }
}

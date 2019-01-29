package com.example.weatherforecast;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class WeatherForecastDto {
    public String title;
    public ForecastDto todayForecast;
    public ForecastDto tomorrowForecast;
    public ForecastDto datAfterTomorrowForecast;

}

package com.example.weatherforecast;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class WeatherForecastDto {
    public String title;
    public List<ForecastDto> forecasts;
}

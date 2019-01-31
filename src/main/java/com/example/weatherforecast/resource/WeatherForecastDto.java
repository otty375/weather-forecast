package com.example.weatherforecast.resource;

import com.example.weatherforecast.resource.ForecastDto;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class WeatherForecastDto {
    public String title;
    public List<ForecastDto> forecasts;
}

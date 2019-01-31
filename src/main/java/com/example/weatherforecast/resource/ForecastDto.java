package com.example.weatherforecast.resource;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ForecastDto {
    public String telop;
    public String date;
    public String imageUrl;
}

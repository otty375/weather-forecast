package com.example.weatherforecast;

import org.springframework.stereotype.Component;

@Component
public class WeatherService {

    public String getWeather(String city) {
        return city + ": Sunny";
    }
}

package com.example.weatherforecast;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class WeatherForecastService {

    private static final String URL = "http://weather.livedoor.com/forecast/webservice/json/v1?city=400040";

    public String getWeather(String city) {
        RestTemplate restTemplate = new RestTemplate();
        WeatherForecast response = restTemplate.getForObject(URL, WeatherForecast.class);
        
        String title = response.getTitle();

        return title;
    }
}

package com.example.weatherforecast.service;

import com.example.weatherforecast.CityEnum;
import com.example.weatherforecast.resource.WeatherForecast;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class WeatherForecastServiceImpl implements WeatherForecastService {

    private final String WEATHER_URL = "http://weather.livedoor.com/forecast/webservice/json/v1?city=";

    @Override
    public WeatherForecast getWeather(String city) {
        String cityId = CityEnum.valueOf(city.toUpperCase()).getId();

        RestTemplate restTemplate = new RestTemplate();
        WeatherForecast response = restTemplate.getForObject(WEATHER_URL + cityId, WeatherForecast.class);

        return response;
    }
}

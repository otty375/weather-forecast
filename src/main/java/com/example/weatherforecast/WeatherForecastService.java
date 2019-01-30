package com.example.weatherforecast;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class WeatherForecastService {

    private static final String URL = "http://weather.livedoor.com/forecast/webservice/json/v1?city=";

    public WeatherForecastDto getWeather(String city) {
        String cityId = CityEnum.valueOf(city.toUpperCase()).getId();
        // TODO 取れなかったときの処理

        RestTemplate restTemplate = new RestTemplate();
        WeatherForecast response = restTemplate.getForObject(URL + cityId, WeatherForecast.class);

        return WeatherForecastDtoFactory.getWeatherForecastDto(response);
    }
}

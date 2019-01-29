package com.example.weatherforecast;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class WeatherController {

    @Autowired
    WeatherForecastService weatherService;

    @RequestMapping(value = "/weather", method = GET)
    public String getWeather(@RequestParam(name = "city", defaultValue = "Tokyo") String city) {
        WeatherForecastDto dto = weatherService.getWeather(city);

        return dto.getTodayForecast().getTelop();
    }
}

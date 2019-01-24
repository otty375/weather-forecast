package com.example.weatherservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    @RequestMapping("/weather")
    public String getWeather(@RequestParam(name = "city", defaultValue = "Tokyo") String city) {
        return city + ": Sunny";
    }
}

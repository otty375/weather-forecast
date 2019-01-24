package com.example.weatherservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class WeatherController {

    @RequestMapping(value = "/weather", method = GET)
    public String getWeather(@RequestParam(name = "city", defaultValue = "Tokyo") String city) {
        return city + ": Sunny";
    }
}

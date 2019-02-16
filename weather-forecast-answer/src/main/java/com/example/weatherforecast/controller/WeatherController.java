package com.example.weatherforecast.controller;

import com.example.weatherforecast.CityNotFoundException;
import com.example.weatherforecast.resource.WeatherForecast;
import com.example.weatherforecast.service.WeatherForecastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class WeatherController {

    private final WeatherForecastService weatherService;

    @Autowired
    public WeatherController(WeatherForecastService weatherService) {
        this.weatherService = weatherService;
    }

    @RequestMapping(value = "/weather", method = GET)
    public String getWeather(Model model, @RequestParam(name = "city", defaultValue = "tokyo") String city) throws Exception {
        WeatherForecast weatherForecast = weatherService.getWeather(city);
        model.addAttribute("title", weatherForecast.getTitle());
        model.addAttribute("forecasts", weatherForecast.getForecasts());
        return "weather";
    }

    @ExceptionHandler({CityNotFoundException.class})
    public String handleError() {
        return "error";
    }
}
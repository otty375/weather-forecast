package com.example.weatherforecast.controller;

import com.example.weatherforecast.resource.WeatherForecastDto;
import com.example.weatherforecast.service.WeatherForecastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class WeatherController {

    @Autowired
    private WeatherForecastService weatherService;

    @RequestMapping(value = "/weather", method = GET)
    public String getWeather(Model model, @RequestParam(name = "city", defaultValue = "tokyo") String city) {
        WeatherForecastDto dto = weatherService.getWeather(city);
        model.addAttribute("title", dto.getTitle());
        model.addAttribute("forecasts", dto.getForecasts());
        return "weather";
    }
}
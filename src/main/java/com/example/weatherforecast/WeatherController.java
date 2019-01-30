package com.example.weatherforecast;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class WeatherController {

    @Autowired
    WeatherForecastService weatherService;

    @RequestMapping(value = "/weather", method = GET)
    public String getWeather(Model model, @RequestParam(name = "city", defaultValue = "Tokyo") String city) {
        WeatherForecastDto dto = weatherService.getWeather(city);
        model.addAttribute("city", dto.getTitle());
        model.addAttribute("today", dto.getTodayForecast());
        return "weather";
    }
}

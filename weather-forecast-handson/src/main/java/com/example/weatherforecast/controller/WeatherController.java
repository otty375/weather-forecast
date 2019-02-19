package com.example.weatherforecast.controller;

import com.example.weatherforecast.resource.CityNotFoundException;
import com.example.weatherforecast.resource.WeatherForecast;
import com.example.weatherforecast.service.WeatherForecastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

// 演習3-1 コントローラのBean定義をしよう

public class WeatherController {

    // 演習6-1 WeatherServiceをコンストラクタインジェクションしよう






    // 演習3-2 リクエストマッピングの設定をしよう

    public String getWeather(Model model, /** 演習3-3 リクエストパラメータの設定をしよう **/ String city) throws Exception {
        WeatherForecast weatherForecast = weatherForecastService.getWeather(city);

        // 演習7-1 コントローラ層でModelに情報を詰めていることを確認しよう（編集不要）
        model.addAttribute("title", weatherForecast.getTitle());
        model.addAttribute("forecasts", weatherForecast.getForecasts());

        // 演習7-2 コントローラ層でビュー名を返していることを確認しよう（編集不要）
        return "weather";
    }

    // 演習8-2 コントローラ層で例外をハンドリングしてみよう

    public String handleError() {
        return "error";
    }
}

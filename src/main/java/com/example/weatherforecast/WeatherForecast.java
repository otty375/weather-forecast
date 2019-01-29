package com.example.weatherforecast;

import lombok.Getter;

import java.util.List;

@Getter
public class WeatherForecast {
    public String publicTime;
    public String title;
    public Description description;
    public String link;
    public List<Forecast> forecasts;
    public Location location;
    public List<PinpointLocation> pinpointLocation;
    public Copyright copyright;
}

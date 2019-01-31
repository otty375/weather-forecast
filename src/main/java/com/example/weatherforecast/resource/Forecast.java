package com.example.weatherforecast.resource;

import lombok.Getter;

@Getter
public class Forecast {
    public String dateLabel;
    public String telop;
    public String date;
    public Temperature temperature;
    public Image image;
}
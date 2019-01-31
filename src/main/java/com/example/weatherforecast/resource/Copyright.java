package com.example.weatherforecast.resource;

import lombok.Getter;

import java.util.List;

@Getter
public class Copyright {
    public List<Provider> provider;
    public String link;
    public String title;
    public Image image;
}
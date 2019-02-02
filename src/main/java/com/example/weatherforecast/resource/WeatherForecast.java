package com.example.weatherforecast.resource;

import lombok.Getter;

import java.util.List;

/**
 * 天気予報レスポンスリソース
 * 詳細はこちらを参照
 * http://weather.livedoor.com/weather_hacks/webservice
 */
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

    @Getter
    public static class Description {
        public String text;
        public String publicTime;
    }

    @Getter
    public static class Forecast {
        public String dateLabel;
        public String telop;
        public String date;
        public Temperature temperature;
        public Image image;
    }

    @Getter
    public static class Temperature {
        public TemperatureInfo min;
        public TemperatureInfo miz;
    }

    @Getter
    public static class TemperatureInfo {
        public String celsius;
        public String fahrenheit;
    }

    @Getter
    public static class Image {
        public String width;
        public String url;
        public String title;
        public String height;
        public String link;
    }

    @Getter
    public static class Location {
        public String city;
        public String area;
        public String prefecture;

    }

    @Getter
    public static class PinpointLocation {
        public String link;
        public String name;
    }

    @Getter
    public static class Copyright {
        public List<Provider> provider;
        public String link;
        public String title;
        public Image image;
    }

    @Getter
    public static class Provider {
        public String link;
        public String name;
    }
}

package com.example.weatherforecast.resource;

import lombok.Getter;

import java.util.List;

/**
 * 天気予報レスポンスリソース
 * 詳細はこちらを参照
 * http://weather.livedoor.com/weather_hacks/webservice
 */
// 演習2-1 天気予報リソースクラスを確認しよう（編集不要）
// 演習2-2 lombokのアノテーションを確認しよう（編集不要）
@Getter
public class WeatherForecast {
    private String publicTime;
    private String title;
    private Description description;
    private String link;
    private List<Forecast> forecasts;
    private Location location;
    private List<PinpointLocation> pinpointLocation;
    private Copyright copyright;

    @Getter
    public static class Description {
        private String text;
        private String publicTime;
    }

    @Getter
    public static class Forecast {
        private String dateLabel;
        private String telop;
        private String date;
        private Temperature temperature;
        private Image image;
    }

    @Getter
    public static class Temperature {
        private TemperatureInfo min;
        private TemperatureInfo miz;
    }

    @Getter
    public static class TemperatureInfo {
        private String celsius;
        private String fahrenheit;
    }

    @Getter
    public static class Image {
        private String width;
        private String url;
        private String title;
        private String height;
        private String link;
    }

    @Getter
    public static class Location {
        private String city;
        private String area;
        private String prefecture;

    }

    @Getter
    public static class PinpointLocation {
        private String link;
        private String name;
    }

    @Getter
    public static class Copyright {
        private List<Provider> provider;
        private String link;
        private String title;
        private Image image;
    }

    @Getter
    public static class Provider {
        private String link;
        private String name;
    }
}

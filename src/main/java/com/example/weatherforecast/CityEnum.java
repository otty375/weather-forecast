package com.example.weatherforecast;

import lombok.Getter;

@Getter
public enum CityEnum {

    TOKYO("130010"),
    OSAKA("270000"),
    AICHI("230010"),
    FUKUOKA("400010");
    // TODO 他の地域も

    private final String id;

    CityEnum(String id) {
        this.id = id;
    }
}

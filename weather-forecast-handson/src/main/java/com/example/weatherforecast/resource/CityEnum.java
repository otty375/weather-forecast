package com.example.weatherforecast.resource;

import lombok.Getter;

import java.util.Arrays;

/**
 * 都道府県の県庁所在地のID番号を紐付けるEnum
 * 他の地域はこちらを参照
 * http://weather.livedoor.com/forecast/rss/primary_area.xml
 */
@Getter
public enum CityEnum {

    HOKKAIDO("016010", "hokkaido"),
    AOMORI("020010", "aomori"),
    IWATE("030010", "iwate"),
    MIYAGI("040010", "miyagi"),
    AKITA("050010", "akita"),
    YAMAGATA("060010", "yamagata"),
    FUKUSHIMA("070010", "fukushima"),
    IBARAKI("080010", "ibaraki"),
    TOCHIGI("090010", "tochigi"),
    GUMMA("100010", "gumma"),
    SAITAMA("110010", "saitama"),
    CHIBA("120010", "chiba"),
    TOKYO("130010", "tokyo"),
    KANAGAWA("140010", "kanagawa"),
    NIIGATA("150010", "niigata"),
    TOYAMA("160010", "toyama"),
    ISHIKAWA("170010", "ishikawa"),
    FUKUI("180010", "fukui"),
    YAMANASHI("190010", "yamanashi"),
    NAGANO("200010", "nagano"),
    GIFU("210010", "gifu"),
    SHIZUOKA("220010", "shizuoka"),
    AICHI("230010", "aichi"),
    MIE("240010", "mie"),
    SHIGA("250010", "shiga"),
    KYOTO("260010", "kyoto"),
    OSAKA("270000", "osaka"),
    HYOGO("280010", "hyogo"),
    NARA("290010", "nara"),
    WAKAYAMA("300010", "wakayama"),
    TOTTORI("310010", "tottori"),
    SHIMANE("320010", "shimane"),
    OKAYAMA("330010", "okayama"),
    HIROSHIMA("340010", "hiroshima"),
    YAMAGUCHI("350010", "yamaguchi"),
    TOKUSHIMA("360010", "tokushima"),
    KAGAWA("370000", "kagawa"),
    EHIME("380010", "ehime"),
    KOCHI("390010", "kochi"),
    FUKUOKA("400010", "fukuoka"),
    SAGA("410010", "saga"),
    NAGASAKI("420010", "nagasaki"),
    KUMAMOTO("430010", "kumamoto"),
    OITA("440010", "oita"),
    MIYAZAKI("450010", "miyazaki"),
    KAGOSHIMA("460010", "kagoshima"),
    OKINAWA("471010", "okinawa");

    private final String id;

    private final String name;

    CityEnum(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // 演習8-1 例外をスローしている処理を確認しよう（編集不要）
    public static CityEnum getCity(String name) throws CityNotFoundException {
        return Arrays.asList(CityEnum.values()).stream()
                .filter(cityEnum -> cityEnum.getName().equals(name))
                .findFirst()
                .orElseThrow(() -> new CityNotFoundException());
    }
}

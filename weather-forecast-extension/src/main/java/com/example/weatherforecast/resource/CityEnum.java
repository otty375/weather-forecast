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

    HOKKAIDO("016010", "hokkaido", "北海道"),
    AOMORI("020010", "aomori", "青森"),
    IWATE("030010", "iwate", "岩手"),
    MIYAGI("040010", "miyagi", "宮城"),
    AKITA("050010", "akita", "秋田"),
    YAMAGATA("060010", "yamagata", "山形"),
    FUKUSHIMA("070010", "fukushima", "福島"),
    IBARAKI("080010", "ibaraki", "茨城"),
    TOCHIGI("090010", "tochigi", "栃木"),
    GUMMA("100010", "gumma", "群馬"),
    SAITAMA("110010", "saitama", "埼玉"),
    CHIBA("120010", "chiba", "千葉"),
    TOKYO("130010", "tokyo", "東京"),
    KANAGAWA("140010", "kanagawa", "神奈川"),
    NIIGATA("150010", "niigata", "新潟"),
    TOYAMA("160010", "toyama", "富山"),
    ISHIKAWA("170010", "ishikawa", "石川"),
    FUKUI("180010", "fukui", "福井"),
    YAMANASHI("190010", "yamanashi", "山梨"),
    NAGANO("200010", "nagano", "長野"),
    GIFU("210010", "gifu", "岐阜"),
    SHIZUOKA("220010", "shizuoka", "静岡"),
    AICHI("230010", "aichi", "愛知"),
    MIE("240010", "mie", "三重"),
    SHIGA("250010", "shiga", "滋賀"),
    KYOTO("260010", "kyoto", "京都"),
    OSAKA("270000", "osaka", "大阪"),
    HYOGO("280010", "hyogo", "兵庫"),
    NARA("290010", "nara", "奈良"),
    WAKAYAMA("300010", "wakayama", "和歌山"),
    TOTTORI("310010", "tottori", "鳥取"),
    SHIMANE("320010", "shimane", "島根"),
    OKAYAMA("330010", "okayama", "岡山"),
    HIROSHIMA("340010", "hiroshima", "広島"),
    YAMAGUCHI("350010", "yamaguchi", "山口"),
    TOKUSHIMA("360010", "tokushima", "徳島"),
    KAGAWA("370000", "kagawa", "香川"),
    EHIME("380010", "ehime", "愛媛"),
    KOCHI("390010", "kochi", "高知"),
    FUKUOKA("400010", "fukuoka", "福岡"),
    SAGA("410010", "saga", "佐賀"),
    NAGASAKI("420010", "nagasaki", "長崎"),
    KUMAMOTO("430010", "kumamoto", "熊本"),
    OITA("440010", "oita", "大分"),
    MIYAZAKI("450010", "miyazaki", "宮崎"),
    KAGOSHIMA("460010", "kagoshima", "鹿児島"),
    OKINAWA("471010", "okinawa", "沖縄");

    private final String id;

    private final String name;

    private final String kanjiName;

    CityEnum(String id, String name, String kanjiName) {
        this.id = id;
        this.name = name;
        this.kanjiName = kanjiName;
    }

    public static CityEnum getCity(String name) throws CityNotFoundException {
        return Arrays.asList(CityEnum.values()).stream()
                .filter(cityEnum -> cityEnum.getName().equals(name))
                .findFirst()
                .orElseThrow(() -> new CityNotFoundException());
    }
}

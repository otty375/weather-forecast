# weather-forecast
指定された都道府県の天気予報を表示するWebアプリケーションです。

weather-forecast-answerフォルダが完成形のアプリケーションです。

weather-forecast-handsonフォルダはハンズオン用のフォルダです。

# 完成形アプリケーション起動
weather-forecast-answerフォルダに移動し、以下のコマンドを実行してください。

`./mvnw spring-boot:run`

以下のURLにアクセスし、起動後画面が表示されればOKです。
http://localhost:8080/weather

# 起動後画面
## 地域指定なし
<img width="413" alt="2019-02-16 15 55 37" src="https://user-images.githubusercontent.com/29173876/52895864-8fc73a80-3203-11e9-849f-2a00aca55661.png">

## 地域指定あり
<img width="520" alt="2019-02-01 8 22 07" src="https://user-images.githubusercontent.com/29173876/52092485-0dcbf480-25fb-11e9-9cf0-c7bf4f75d674.png">

# リクエストパラメータ
`city={都道府県をローマ字で指定}`

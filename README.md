# weather-forecast
指定された都道府県の天気予報を表示するWebアプリケーションです。

`weather-forecast-answer`フォルダが解答用プロジェクトです。

`weather-forecast-handson`フォルダはハンズオン用のフォルダです。

# 解答用プロジェクトの完成形アプリケーション起動

ハンズオンで使用する解答用プロジェクトが起動するかどうか確認します。

IntelliJから起動する場合：

以下のファイルを開いてください。

weather-forecast-answer/src/main/java/com/example/weatherforecast/WeatherForecastApplication.java

IntelliJメニューの`Run -> Run WeatherForecastApplication`を選択するか、 `WeatherForecastApplication`クラスの左にある緑色の三角マークをクリックしてください。

ターミナル等から起動する場合：

`weather-forecast-answer`フォルダに移動して以下のコマンドを実行してください。

`./mvnw spring-boot:run`

以下のURLにアクセスし、起動後画面が表示されればOKです。

http://localhost:8080/weather

動作確認が終わったらアプリケーションを終了させましょう。

IntelliJで終了する場合は、起動ログの左のメニューの赤い四角をクリックします。

ターミナル等から終了する場合は`control + c`です。

# 起動後画面
## 地域指定なし
<img width="413" alt="2019-02-16 15 55 37" src="https://user-images.githubusercontent.com/29173876/52895864-8fc73a80-3203-11e9-849f-2a00aca55661.png">

## 地域指定あり
<img width="520" alt="2019-02-01 8 22 07" src="https://user-images.githubusercontent.com/29173876/52092485-0dcbf480-25fb-11e9-9cf0-c7bf4f75d674.png">

# リクエストパラメータ
`city={都道府県をローマ字で指定}`

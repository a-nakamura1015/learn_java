package chapter_4.kadai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Greeting {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("いま何時？");
            int hour = Integer.parseInt(reader.readLine());

            if (hour >= 0 && hour < 12) {
                // 午前中：0時から11時
                System.out.println("おはようございます。");
            } else if (hour == 12) {
                // 正午：12時
                System.out.println("お昼です。");
            } else if (hour >= 13 && hour <= 18) {
                // 午後：13時から18時
                System.out.println("こんにちは");
            } else if (hour >= 19 && hour <= 23) {
                // 夜：19時から23時
                System.out.println("こんばんは");
            } else {
                System.out.println("自国の範囲を超えています");
            }
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("入力値が不正です。");
        }
    }
}

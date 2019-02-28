package chapter_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Umbrella1 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("降水確率を入力してください。");
            String line = reader.readLine();
            int rainfallProbability = Integer.parseInt(line);
            System.out.printf("入力された降水確率は%d％です。%n", rainfallProbability);

            if (rainfallProbability < 0 || rainfallProbability > 100) {
                System.out.println("入力された降水確率が不正です。");
            } else if (rainfallProbability >= 50) {
                System.out.println("傘を忘れずにね。");
            } else {
                System.out.println("傘はいりません。");
            }
            System.out.println("いってらっしゃい");

        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("数字の形式が正しくありません。");
        }
    }
}

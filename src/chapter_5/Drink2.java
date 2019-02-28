package chapter_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Drink2 {
    public static void main(String[] args) {
        System.out.println("飲み物は何が好きですか？");
        System.out.println("a：オレンジジュース");
        System.out.println("b；コーヒー");
        System.out.println("c：どちらでもない");
        System.out.println("a, b, cのいずれかを選んでください。");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line = reader.readLine();
            if (line.length() > 0) {
                char result = reader.readLine().charAt(0);
                switch (result) {
                    case 'a':
                        System.out.println("オレンジジュースです。");
                        break;

                    case 'b':
                        System.out.println("コーヒーです。");
                        break;

                    default:
                        System.out.println("どちらでもありません");
                        break;
                }
            } else {
                System.out.println("未入力でEnterが押されたため処理を中断しました。");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

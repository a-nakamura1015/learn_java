package chapter_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Drink1 {
    public static void main(String[] args) {
        System.out.println("飲み物は何が好きですか？");
        System.out.println("1：オレンジジュース");
        System.out.println("2；コーヒー");
        System.out.println("3：ミルク");
        System.out.println("1, 2, 3のいずれかを選んでください。");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int number = Integer.parseInt(reader.readLine());
            switch (number) {
                case 1:
                    System.out.println("オレンジジュースです。");
                    break;

                case 2:
                    System.out.println("コーヒーです。");
                    break;

                case 3:
                    System.out.println("ミルクです。");
                    break;

                default:
                    System.out.println("どれでもありません");
                    break;
            }
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("数字の形式が正しくありません。");
        }
    }
}

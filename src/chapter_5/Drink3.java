package chapter_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Drink3 {
    public static void main(String[] args) {
        System.out.println("飲み物は何が好きですか？");
        System.out.println("1：オレンジジュース(a)");
        System.out.println("2；コーヒー(b)");
        System.out.println("3：どちらでもない(c)");
        System.out.println("1, 2, 3のいずれかを選んでください。(a, b, cでも選べます。)");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            char result = reader.readLine().charAt(0);
            switch (result) {
                case '1':
                case 'a':
                    System.out.println("オレンジジュースです。");
                    break;

                case '2':
                case 'b':
                    System.out.println("コーヒーです。");
                    break;

                default:
                    System.out.println("どちらでもありません");
                    break;
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

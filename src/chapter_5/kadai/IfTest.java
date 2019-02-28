package chapter_5.kadai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfTest {
    public static void main(String[] args) {
        System.out.println("飲み物は何が好きですか？");
        System.out.println("1：オレンジジュース");
        System.out.println("2；コーヒー");
        System.out.println("1, 2のどちらかを選んでください。");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            char result = reader.readLine().charAt(0);
            if (result == '1' || result == 'a') {
                System.out.println("オレンジジュースです。");
            } else if (result == '2' || result == 'b') {
                System.out.println("コーヒーです。");
            } else {
                System.out.println("どちらでもありません。");
            }
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("数字の形式が正しくありません。");
        }
    }
}

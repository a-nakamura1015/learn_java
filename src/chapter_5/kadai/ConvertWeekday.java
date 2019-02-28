package chapter_5.kadai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConvertWeekday {
    public static void main(String[] args) {
        System.out.println("0〜6の数字を入力してください。対応した曜日を表示します。");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int number = Integer.parseInt(reader.readLine());
            switch(number) {
                case 0:
                    System.out.println("日曜日");
                    break;

                case 1:
                    System.out.println("月曜日");
                    break;

                case 2:
                    System.out.println("火曜日");
                    break;

                case 3:
                    System.out.println("水曜日");
                    break;

                case 4:
                    System.out.println("木曜日");
                    break;

                case 5:
                    System.out.println("金曜日");
                    break;

                case 6:
                    System.out.println("土曜日");
                    break;

                default:
                    System.out.println("0〜6の範囲で入力してください。");
                    break;

            }
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("入力値が不正です。半角数字で入力してください。");
        }
    }
}

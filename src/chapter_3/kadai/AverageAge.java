package chapter_3.kadai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AverageAge {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            // 1人目の情報を取得
            System.out.println("1人目の名前を入力してください。");
            String name = reader.readLine();
            System.out.printf("%sさんの年齢を入力してください。%n", name);
            int age = Integer.parseInt(reader.readLine());

            // 2人目の情報を取得
            System.out.println("2人目の名前を入力してください。");
            String _name = reader.readLine();
            System.out.printf("%sさんの年齢を入力してください。%n", _name);
            int _age = Integer.parseInt(reader.readLine());

            // 結果出力
            System.out.printf("%sさんと%sさんの平均年齢：%.1f", name, _name, (double)(age + _age) / 2);

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

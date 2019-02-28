package chapter_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Find1 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("使用法：java Find1 検索文字列 < 検索対象ファイル");
            System.out.println("例：java Find1 System < Find1.java");
            System.exit(0);
        }
        String findString = args[0];
        System.out.printf("検索文字列は「%s」です。%n", findString);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line;
            int lineNum = 0;
            while ((line = reader.readLine()) != null) {
                int n = line.indexOf(findString);
                if (n >= 0) {
                    System.out.printf("%d:%s", lineNum, line);
                }
                lineNum++;
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

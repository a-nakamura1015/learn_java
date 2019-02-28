package chapter_3.kadai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConvertCharacterCode {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("文字を入力してください。");
            String line = reader.readLine();
            for (int index = 0; index < line.length(); index++) {
                char dst = line.charAt(index);
                int characterCode = (int)dst;
                System.out.printf("'%c'の文字コードは%dです。%n", dst, characterCode);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

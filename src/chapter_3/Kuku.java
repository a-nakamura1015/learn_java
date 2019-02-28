package chapter_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Kukuは、九九の問題をランダムに10個表示して
 * その正解数と正答率を表示するプログラムである。
 *
 * @author a-nakamura
 * @copyright by a-nakamura.
 */
public class Kuku {
    /* 表示する問題の個数 */
    public static final int MAX_QUESTION = 10;

    /**
     * 九九の問題を表示する最大の問題数分繰り返して出題する。
     * 最後に正答率を小数点以下は切捨てで表示する。
     *
     * @param args
     */
    public static void main(String[] args) {

        System.out.printf("これから九九の問題を%d問出します。%n", MAX_QUESTION);

        // 正解した問題数
        int goodAnswers = 0;

        // 問題を繰り返し表示し、ユーザーからの解答を判定する。
        for (int index = 1; index <= MAX_QUESTION; index++) {
            boolean ok = showQuestion(index);
            if (ok) {
                goodAnswers++;
            }
        }

        // 正答率
        double rate = goodAnswers * 100.0 / MAX_QUESTION;
        System.out.printf("%n問題は%d問ありました。", MAX_QUESTION);
        System.out.printf("%n正しく答えられたのは%d問で、", goodAnswers);
        System.out.printf("%n間違ってしまったのは%d問です。", (MAX_QUESTION - goodAnswers));
        System.out.printf("%n正答率は%.1f％です。%nお疲れ様です。", rate);
    }

    /**
     * 九九の問題を1問出し、答えを待つ。
     * 答えが入力されると結果の判定を行い、判定結果を表示する。
     *
     * @param questNo 問題の番号
     * @return 解答の判定結果（trueであれば正解、falseであれば不正解）
     */
    public static boolean showQuestion(int questNo){
        int x = (int)(Math.random() * 9) + 1;
        int y = (int)(Math.random() * 9) + 1;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.printf("[第%d問] %d × %d = ?%n", questNo, x, y);
            String line = reader.readLine();
            int result = Integer.parseInt(line);
            if (x * y == result) {
                System.out.println("正解！");
                return true;
            } else {
                System.out.println("不正解。。。");
                return false;
            }
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("入力が正しくありません。");
        }
        return false;
    }
}

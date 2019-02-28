package chapter_6.kadai;

public class DrawGraph {
    public static void main(String[] args) {
        draw(10);
    }

    /**
     * 高さを指定してひし形の図形を表示する。
     * @param height 高さ
     */
    public static void draw(int height) {
        // 中央の段数
        int middle = (int)Math.round((double)height / 2);

        for (int index = 1; index <= height; index++) {
            // 出力するスペースの数(中央の段数-段数の絶対値)
            int spaceCount = Math.abs(middle - index);

            // 出力するアスタリスクの数(図形の高さ - 出力するスペースの数 × 2)
            int outputCount = height - spaceCount * 2;

            // スペースを出力する
            outputMark(spaceCount, ' ');

            // アスタリスクを出力する
            outputMark(outputCount, '*');

            // 改行する
            System.out.println("");
        }
    }

    /**
     * 指定されたカウントの数だけマークを出力する。
     * @param count カウント
     * @param mark マーク
     */
    public static void outputMark(int count, char mark) {
        for (int index = 0; index < count; index++) {
            System.out.print(mark);
        }
    }
}

package chapter_8.kadai;

public class Graph2 {
    public static void main(String[] args) {
        printGraph(5);
    }

    /**
     * 放物線のグラフを作成する。
     * @param x
     */
    public static void printGraph(int x) {
        for (int index = x; index >= -x; index--) {
            int markCount = getPower(index, 2);
            for (int _index = 0; _index < markCount; _index++) {
                System.out.print('*');
            }
            System.out.println("");
        }
    }
    /* xのn乗の計算 */
    public static int getPower(int x, int n) {
        int y = 1;
        for (int i = 0; i < n; i++) {
            y = y * x;
        }
        return y;
    }
}

/**
 * 実行結果
 *
 * *************************
 * ****************
 * *********
 * ****
 * *
 *
 * *
 * ****
 * *********
 * ****************
 * *************************
 */

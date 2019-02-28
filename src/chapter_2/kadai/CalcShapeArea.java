package chapter_2.kadai;

public class CalcShapeArea {
    /**
     * 上底が2センチ、下底が3センチ、高さが4センチの台形の面積を計算する。
     */
    public static void main(String[] args) {
        // 上底
        int upperBase = 2;
        // 下底
        int lowerBase = 3;
        // 高さ
        int height = 4;
        // 計算結果
        System.out.print(calcTrapezoid(upperBase, lowerBase, height));
    }

    public static int calcTrapezoid(int upperBase, int lowerBase, int height) {
        return (upperBase + lowerBase) * height / 2;
    }
}

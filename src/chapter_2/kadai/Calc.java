package chapter_2.kadai;

/**
 * 次の表を完成させるプログラムを作る。
 * 0×0=
 * 1×1=
 * 2×2=
 * 3×3=
 * 4×4=
 * 5×5=
 * 6×6=
 * 7×7=
 * 8×8=
 * 9×9=
 * 10×10=
 */
public class Calc {
    public static void main(String[] args) {
        for (int index = 0; index <= 10; index++)  System.out.printf("%d×%d=%d%n", index, index, index * index);
    }
}

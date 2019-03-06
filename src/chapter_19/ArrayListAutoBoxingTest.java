package chapter_19;

import java.util.ArrayList;

public class ArrayListAutoBoxingTest {
    public static void main(String[] args) {
        // ArrayListのインスタンスの確保
        ArrayList<Integer> list = new ArrayList<Integer>();

        // 要素の追加（addメソッド）
        list.add(12);
        list.add(34);
        list.add(56);
        list.add(78);
        list.add(90);

        // 拡張forループ
        for (int n : list) {
            System.out.println(n);
        }
    }
}

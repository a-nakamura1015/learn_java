package chapter_19;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
    public static void main(String[] args) {
        // ArrayListのインスタンスを確保
        ArrayList<String> list = new ArrayList<>();

        // 要素の追加（addメソッド）
        list.add("Alice");
        list.add("Bob");
        list.add("Chris");

        // さらに要素の追加（addメソッド）
        list.add("Diana");
        list.add("Elmo");

        // 要素の参照（getメソッド)
        // 削除前に要素を表示
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + ":" + list.get(i));
        }
        System.out.println();

//        // イテレータを使ったforループ
//        for (Iterator<String> it = list.iterator(); it.hasNext(); ) {
//            String name = it.next();
//            System.out.println(name);
//        }

//        // 拡張forループ
//        for (String name : list) {
//            System.out.println(name);
//        }

        // AliceとBobとElmoを削除
        list.remove("Alice");
        list.remove("Bob");
        list.remove("Elmo");

        // 削除後に要素を表示
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + ":" + list.get(i));
        }
        System.out.println();

        // Aliceは含まれているか？
        if (list.contains("Alice")) {
            System.out.println("listにAliceは含まれています。");
        } else {
            System.out.println("listにAliceは含まれていません。");
        }
    }
}

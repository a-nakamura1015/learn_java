package chapter_13;

import jdk.nashorn.internal.runtime.arrays.ArrayIndex;

public class ExceptionTest2 {
    public static void main(String[] args) {
        int[] myArray = new int[3];
        try {
            System.out.println("代入します");
            myArray[100] = 0;
            System.out.println("代入しました");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("代入できませんでした");
            System.out.println("例外は" + e + "です");
        }
        System.out.println("終了します");
    }
}

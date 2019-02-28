package chapter_13;

public class ExceptionTest3 {
    public static void main(String[] args) {
        int[] myArray = new int[3];
        System.out.println("代入します");
        myAssign(myArray, 100, 0);
    }
    static void myAssign(int[] arr, int index, int value) {
        try {
            System.out.println("myAssignに来ました");
            arr[index] = value;
            System.out.println("myAssignから帰ります");
            System.out.println("代入しました");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("代入できませんでした");
            System.out.println("例外は" + e + "です。");
        }
        System.out.println("終了します");
    }
}

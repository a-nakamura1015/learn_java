package chapter_13;

public class ExceptionTest4 {
    public static void main(String[] args) {
        int[] myArray = new int[3];
        try {
            System.out.println("代入します");
            myAssign(myArray, 100, 0);
            System.out.println("代入しました");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("代入できませんでした");
            System.out.println("例外は" + e + "です");
            e.printStackTrace();
        }
        System.out.println("終了します");
    }
    static void myAssign(int[] arr, int index, int value) {
        System.out.println("myAssignに来ました");
        arr[index] = value;
        System.out.println("myAssignから帰ります");
    }
}

package chapter_13;

public class ExceptionTest1 {
    public static void main(String[] args) {
        int[] myArray = new int[3];
        System.out.println("代入します");
        myArray[100] = 0; // ArrayIndexOutOfBoundsExceptionが発生
        System.out.println("代入しました");
        System.out.println("終了します");
    }
}

package chapter_6;

public class Count4 {
    public static void main(String[] args) {
        for (int index = 0; index < 10; index++) {
            System.out.printf("%d:", index);
            for (int _index = 0; _index < index; _index++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

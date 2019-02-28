package chapter_6;

public class Count3 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.printf("%dの2乗は%dで、3乗は%dです。%n", i, (i * i), (i * i * i));
        }
        System.out.println("end");
    }
}

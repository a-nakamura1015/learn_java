package chapter_9;

public class Heikin3 {
    public static void main(String[] args) {
        int[] ten;
        int sum;
        double heikin;

        ten = new int[3];
        ten[0] = 63;
        ten[1] = 90;
        ten[2] = 75;
        sum = 0;
        for (int i = 0; i < 3; i++) {
            sum = sum + ten[i];
        }
        heikin = sum / 3.0;

        System.out.printf("国語は%d点%n", ten[0]);
        System.out.printf("数学は%d点%n", ten[1]);
        System.out.printf("英語は%d点%n", ten[2]);
        System.out.printf("平均点は%.1f点%n", heikin);
    }
}

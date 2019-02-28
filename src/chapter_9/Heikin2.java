package chapter_9;

public class Heikin2 {
    public static void main(String[] args) {
        int[] ten;
        double heikin;

        ten = new int[3];
        ten[0] = 63;
        ten[1] = 90;
        ten[2] = 75;
        heikin = (ten[0] + ten[1] + ten[2]) / 3.0;

        System.out.printf("国語は%d点%n", ten[0]);
        System.out.printf("数学は%d点%n", ten[1]);
        System.out.printf("英語は%d点%n", ten[2]);
        System.out.printf("平均点は%.1f点%n", heikin);
    }
}

package chapter_9;

public class Heikin4 {
    public static void main(String[] args) {
        int[] ten;
        int sum;
        double heikin;

        ten = new int[5];
        ten[0] = 63;
        ten[1] = 90;
        ten[2] = 75;
        ten[3] = 45;
        ten[4] = 81;

        sum = 0;
        for (int i = 0; i < ten.length; i++) {
            sum = sum + ten[i];
        }
        heikin = sum / ten.length;

        System.out.printf("国語は%d点%n", ten[0]);
        System.out.printf("数学は%d点%n", ten[1]);
        System.out.printf("英語は%d点%n", ten[2]);
        System.out.printf("理科は%d点%n", ten[3]);
        System.out.printf("社会は%d点%n", ten[4]);
        System.out.printf("平均点は%.1f点%n", heikin);
    }
}

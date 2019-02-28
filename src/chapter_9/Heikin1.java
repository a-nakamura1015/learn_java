package chapter_9;

public class Heikin1 {
    public static void main(String[] args) {
        int kokugo, suugaku, eigo;
        double heikin;

        kokugo = 63;
        suugaku = 90;
        eigo = 75;
        heikin = (kokugo + suugaku + eigo) / 3.0;

        System.out.printf("国語は%d点%n", kokugo);
        System.out.printf("数学は%d点%n", suugaku);
        System.out.printf("英語は%d点%n", eigo);
        System.out.printf("平均点は%.1f点", heikin);
    }
}

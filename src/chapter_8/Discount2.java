package chapter_8;

public class Discount2 {
    public static void main(String[] args) {
        int p, q;
        p = 10000;
        q = halve(p);
        System.out.printf("元の値段が%d円なら、半額だと%d円になります。", p, q);
    }
    public static int halve(int n) {
        return n / 2;
    }
}

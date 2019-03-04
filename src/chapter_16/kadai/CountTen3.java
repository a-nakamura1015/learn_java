package chapter_16.kadai;

public class CountTen3 extends Thread {
    public static void main(String[] args) {
        CountTen3 ct_1 = new CountTen3();
        CountTen3 ct_2 = new CountTen3();
        CountTen3 ct_3 = new CountTen3();
        ct_1.start();
        ct_2.start();
        ct_3.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main:i = " + i);
        }
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.getName() + " run:i = " + i);
        }
    }
}

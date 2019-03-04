package chapter_16.kadai;

class LabelPrinter extends Thread {
    String label = "no label";
    LabelPrinter(String label) {
        this.label = label;
    }
    @Override
    public void run() {
        while (true) {
            System.out.println(label);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class PrintHello {
    public static void main(String[] args) {
        LabelPrinter th_1 = new LabelPrinter("おはよう!");
        LabelPrinter th_2 = new LabelPrinter("こんにちは!");
        LabelPrinter th_3 = new LabelPrinter("こんばんは!");
        th_1.start();
        th_2.start();
        th_3.start();
    }
}

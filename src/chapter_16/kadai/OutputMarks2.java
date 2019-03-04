package chapter_16.kadai;

public class OutputMarks2 implements Runnable {
    String mark = "";
    Long interval = 0L;
    Integer count = 0;

    OutputMarks2(String mark, Integer interval) {
        this.mark = mark;
        this.interval = interval * 1000L;
        this.count = 10;
    }
    public static void main(String[] args) {
        OutputMarks2 th_1 = new OutputMarks2("***", 3);
        OutputMarks2 th_2 = new OutputMarks2("=====", 5);
        new Thread(th_1).start();
        new Thread(th_2).start();
    }
    @Override
    public void run() {
        for (int index = 0; index < this.count; index++) {
            try {
                Thread.sleep(this.interval);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(this.mark);
        }
    }
}

package chapter_16.kadai;

public class OutputMarks extends Thread {
    String mark = "";
    Long interval = 0L;
    Integer count = 0;

    OutputMarks(String mark, Integer interval) {
        this.mark = mark;
        this.interval = interval * 1000L;
        this.count = 10;
    }
    public static void main(String[] args) {
        OutputMarks th_1 = new OutputMarks("***", 3);
        OutputMarks th_2 = new OutputMarks("=====", 5);
        th_1.start();
        th_2.start();
    }
    @Override
    public void run() {
        for (int index = 0; index < this.count; index++) {
            try {
                sleep(this.interval);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(this.mark);
        }
    }
}

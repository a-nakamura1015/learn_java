package chapter_9.kadai;

public class ShowMaxData {
    public static void main(String[] args) {
        int[] data = {31, 41, 59, 26, 53, 58, 97, 23, 84};
        int max_data = data[0];
        for (int index = 0; index < data.length; index++) {
            if (data[index] > max_data) {
                max_data = data[index];
            }
        }
        System.out.printf("最大値は%dです。", max_data);
    }
}

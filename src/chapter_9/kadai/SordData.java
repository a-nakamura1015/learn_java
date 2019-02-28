package chapter_9.kadai;

public class SordData {
    public static void main(String[] args) {
        int[] data = {31, 41, 59, 26, 53, 58, 97, 23, 84};
        System.out.println("並び替える前");
        for (int index = 0; index < data.length; index++) {
            System.out.print(data[index] + " ");
        }
        System.out.println("");
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                if (data[i] < data[j]) {
                    int dst = data[i];
                    data[i] = data[j];
                    data[j] = dst;
                }
            }
        }
        System.out.println("並び替えた後");
        for (int _index = 0; _index < data.length; _index++) {
            System.out.print(data[_index] + " ");
        }
        System.out.println("");
    }
}

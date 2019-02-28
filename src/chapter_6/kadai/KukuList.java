package chapter_6.kadai;

public class KukuList {
    public static void main(String[] args) {
        for (int index = 1; index <= 9; index++) {
            for (int _index = 1; _index <= 9; _index++) {
                System.out.printf("%d*%d=%d, ", index, _index, index * _index);
            }
            System.out.println("");
        }
    }
}

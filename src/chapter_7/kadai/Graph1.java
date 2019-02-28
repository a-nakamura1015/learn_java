package chapter_7.kadai;

public class Graph1 {
    public static void main(String[] args) {
        int index = 0;
        while (index < 10) {
            int _index = 0;
            while (_index < index * index) {
                System.out.print('*');
                _index++;
            }
            System.out.println("");
            index++;
        }
    }
}

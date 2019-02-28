package chapter_9.kadai;

public class PrintArray {
    public static void main(String[] args) {
        int[][] arr = {
                {3, 1, 4, 1, },
                {5, 9, 2, },
                {6, 5, },
                {3, }
        };
        printArray(arr);
    }
    public static void printArray(int[][] arr) {
        System.out.println("{");
        for (int index = 0; index < arr.length; index++) {
            System.out.print("  {");
            for (int _index = 0; _index < arr[index].length; _index++) {
                System.out.print(arr[index][_index] + ", ");
            }
            System.out.println("  },");
        }
        System.out.println("}");
    }
}

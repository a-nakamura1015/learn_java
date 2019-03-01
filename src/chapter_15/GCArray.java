package chapter_15;

public class GCArray {
    public static void main(String[] args) {
        while(true) {
            int[] a = new int[1000];
            for (int i = 0; i < a.length; i++) {
                a[i] = i;
            }
            System.out.println("残りメモリ = " + Runtime.getRuntime().freeMemory());
        }
    }
}

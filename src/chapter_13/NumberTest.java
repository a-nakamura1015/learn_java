package chapter_13;

public class NumberTest {
    public static void main(String[] args) {
        try {
            String numStr = "XYZ";
            int val = Integer.parseInt(numStr);
            System.out.println("val = " + val);
         } catch (NumberFormatException e) {
            System.out.println("例外:" + e);
        }
    }
}

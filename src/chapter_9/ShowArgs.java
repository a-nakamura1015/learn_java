package chapter_9;

public class ShowArgs {
    public static void main(String[] args) {
        System.out.printf("args.lengthの値は%d%n", args.length);
        for (int index = 0; index < args.length; index++) {
            System.out.printf("args[%d]の値は%sです。%n", index, args[index]);
        }
    }
}

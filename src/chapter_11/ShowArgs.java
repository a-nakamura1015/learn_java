package chapter_11;

public class ShowArgs {
    public static void main(String[] args) {
        System.out.println("args.length = " + args.length);
        for (int index = 0; index < args.length; index++) {
            System.out.println(args[index]);
        }
    }
}

package chapter_18;

import java.io.*;

public class MakeDir {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("使用法：java MakeDir ディレクトリ名");
            System.out.println("例：java MakeDir doc");
            System.exit(0);
        }
        String dirname = args[0];
        File dir =new File(dirname);
        if (dir.mkdir()) {
            System.out.printf("%sを作成しました。\n", dirname);
            System.out.printf("絶対パスは%sです。\n", dir.getAbsolutePath());
        } else {
            System.out.printf("%sを作成できませんでした。", dirname);
        }
    }
}

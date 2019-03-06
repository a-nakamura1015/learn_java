package chapter_18;

import java.io.*;

public class FileDump {
    public static void main(String[] args) {
        DataInputStream in = null;
        if (args.length != 1) {
            System.out.printf("使用法：java FileDump ファイル名\n");
            System.exit(0);
        }
        try {
            in = new DataInputStream(new BufferedInputStream(new FileInputStream(args[0])));
            int offset = 0;
            while (true) {
                byte b = in.readByte();
                if (offset % 16 == 0) {
                    System.out.printf("%s: ", intToHexString(offset));
                } else if (offset % 8 == 0) {
                    System.out.print("-");
                } else {
                    System.out.println(" ");
                }
                System.out.print(byteToHexString(b));
                if (offset % 16 == 15) {
                    System.out.println("");
                }
                offset++;
            }
        } catch (FileNotFoundException e) {
            System.out.printf("%sが見つかりません。", args[0]);
        } catch (EOFException e) {
            System.out.printf("\n");
        } catch (IOException e) {
            System.out.printf("%s\n", e);
        }
        try {
            if (in != null) {
                in.close();
            }
        } catch (IOException e) {
            System.out.printf("%s\n", e);
        }
    }
    public static String intToHexString(int n) {
        return byteToHexString((byte)(n >>> 24))
                + byteToHexString((byte)(n >>> 16))
                + byteToHexString((byte)(n >>> 8))
                + byteToHexString((byte)n);
    }
    public static String byteToHexString(byte b) {
        int n = (int)b;
        if (n < 0) {
            n = 256 + n;
        }
        if (n < 16) {
            return "0" + Integer.toHexString(n).toUpperCase();
        } else {
            return Integer.toHexString(n).toUpperCase();
        }
    }
}

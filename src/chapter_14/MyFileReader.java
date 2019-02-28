package chapter_14;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class MyFileReader extends FileReader implements DebugPrintable {
    String fileName = null;
    public MyFileReader(String fileName) throws FileNotFoundException {
        super(fileName);
        this.fileName = fileName;
    }
    @Override
    public void debugPrint() {
        System.out.println("MyFileReaderのインスタンス：ファイル名は" + fileName + "です。");
    }
}

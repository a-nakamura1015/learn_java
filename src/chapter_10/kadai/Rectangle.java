package chapter_10.kadai;

public class Rectangle {
    int width;      // 幅
    int height;     // 高さ

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public  String toString() {
        return "[" + this.width + "," + this.height + "]";
    }
}

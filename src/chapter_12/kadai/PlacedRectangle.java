package chapter_12.kadai;

/**
 * Rectangleクラスのサブクラスとして下記の機能を持つ
 * ・位置を表すint型のフィールドのx、yを持つ
 * ・３つのコンストラクタを持つ
 * 　(1) 引数なし
 * 　(2) 位置付き
 * 　(3) 位置と大きさ付き
 * ・位置を変更するメソッドsetLocationを持つ
 * ・標準的な文字列表現を返すメソッドtoStringを持つ
 * 　x = 12、y = 34、width = 123、height = 45のとき、
 * 　[ (12, 34) [123, 45]]となるものとする。
 */
public class PlacedRectangle extends Rectangle {
    int x;
    int y;
    public PlacedRectangle() {
        setLocation(0,0);
        setSize(0, 0);
    }
    public PlacedRectangle(int x, int y) {
        setLocation(x, y);
        setSize(0,0);
    }
    public PlacedRectangle(int x, int y, int width, int height) {
        setLocation(x, y);
        setSize(width, height);
    }
    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return "[ (" + this.x + ", " + this.y + ") [" + this.width + ", " + this.height + "]]";
    }
    public static void main(String[] args) {
        PlacedRectangle pr1 = new PlacedRectangle();
        PlacedRectangle pr2 = new PlacedRectangle(1, 2);
        PlacedRectangle pr3 = new PlacedRectangle(10, 20, 30, 40);
        System.out.println(pr1);
        System.out.println(pr2);
        System.out.println(pr3);
    }
}

package chapter_12.kadai;

public class PlacedRectangle_2 {
    int x;
    int y;
    private Rectangle rectangle;
    public PlacedRectangle_2() {
        setLocation(0,0);
        rectangle = new Rectangle();
        rectangle.setSize(0, 0);
    }
    public PlacedRectangle_2(int x, int y) {
        setLocation(x, y);
        rectangle = new Rectangle();
    }
    public PlacedRectangle_2(int x, int y, int width, int height) {
        setLocation(x, y);
        rectangle = new Rectangle(width, height);
    }
    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return "[ (" + this.x + ", " + this.y + ") " +
                "[" + this.rectangle.width + ", " + this.rectangle.height + "]]";
    }
    public static void main(String[] args) {
        PlacedRectangle_2 pr1 = new PlacedRectangle_2();
        PlacedRectangle_2 pr2 = new PlacedRectangle_2(1, 2);
        PlacedRectangle_2 pr3 = new PlacedRectangle_2(10, 20, 30, 40);
        System.out.println(pr1);
        System.out.println(pr2);
        System.out.println(pr3);
    }
}

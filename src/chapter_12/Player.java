package chapter_12;

abstract class Player {
    public abstract void play(); // 抽象メソッド
    public void loop(int n) {
        for (int index = 0; index < n; index++) {
            play();
        }
    }
}

package chapter_10;

public class Kamoku {
    String name;    // 科目名
    int score;      // 点数

    // コンストラクタ
    public Kamoku(String name, int score) {
        this.name = name;
        this.score = score;
    }

    // 科目の文字列表現
    @Override
    public String toString() {
        return name + "は" + score + "点";
    }
}

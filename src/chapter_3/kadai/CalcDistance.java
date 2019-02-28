package chapter_3.kadai;

public class CalcDistance {
    public static void main(String[] args) {
        // 1日の秒数
        int totalSeconds = 60 * 60 * 24;
        // 光が1秒で進む距離(キロメートル)
        long distance = 300000L;
        System.out.println(distance * totalSeconds);
    }
}

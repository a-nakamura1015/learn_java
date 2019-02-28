package chapter_10;

public class KamokuHeikin {
    public static void main(String[] args) {
        Kamoku[] kamoku = {
                new Kamoku("国語", 63),
                new Kamoku("数学", 90),
                new Kamoku("英語", 75),
                new Kamoku("理科", 45),
                new Kamoku("社会", 81)
        };
        int sum = 0;
        for (int index = 0; index < kamoku.length; index++) {
            System.out.println(kamoku[index]);
            sum += kamoku[index].score;
        }
        double heikin = (double)sum / kamoku.length;
        System.out.printf("平均点は%.1f点", heikin);
    }
}

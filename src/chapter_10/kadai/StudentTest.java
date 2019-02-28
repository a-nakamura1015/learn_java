package chapter_10.kadai;

public class StudentTest {
    public static void main(String[] args) {
        Student[] data = {
                new Student("結城浩", 65, 90, 100),
                new Student("阿部和馬", 82, 73, 64),
                new Student("伊藤光一", 74, 31, 42),
                new Student("佐藤太郎", 100, 95, 99),
        };
        for (int index = 0; index < data.length; index++) {
            System.out.printf("%s\t->%d%n", data[index], data[index].total());
        }
    }
}

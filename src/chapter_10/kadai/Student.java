package chapter_10.kadai;

public class Student {
    String name;        // 氏名
    int[] tens;         // 試験の点数
    public Student(String name, int x, int y, int z) {
        this.name = name;
        tens = new int[3];
        tens[0] = x;
        tens[1] = y;
        tens[2] = z;
    }

    @Override
    public String toString() {
        String s = "[" + name;
        for (int index = 0; index < this.tens.length; index++) {
            s += "," + tens[index];
        }
        s += "]";
        return s;
    }

    public int total() {
        int sum = 0;
        for (int index = 0; index < this.tens.length; index++) {
            sum += tens[index];
        }
        return sum;
    }
}

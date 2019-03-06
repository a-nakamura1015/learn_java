package chapter_19.kadai;

public class MyStringArrayList {
    private static final int INITIAL_CAPACITY = 4;
    private String[] ar;
    private int sz;

    public MyStringArrayList() {
        this.ar = new String[INITIAL_CAPACITY];
        this.sz = 0;
    }

    public void add(String s) {
        if (this.sz == INITIAL_CAPACITY) {
            // 配列arがいっぱいの場合
            String[] _ar = this.ar;
            this.ar = new String[INITIAL_CAPACITY * 2];
            int count = 0;
            for (int index = 0; index < INITIAL_CAPACITY; index++) {
                this.ar[index] = _ar[index];
                count++;
            }
            this.ar[count] = s;
            this.sz++;
        } else {
            this.ar[this.sz] = s;
            this.sz++;
        }
    }

    public String get(int n) {
        String result = null;
        try {
            result =  this.ar[n];
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
        return result;
    }

    public int size() {
        return this.sz;
    }

    public static void main(String[] args) {
        MyStringArrayList list = new MyStringArrayList();
        System.out.println("size : " + list.size());
        System.out.println();

        list.add("Alice");
        list.add("Bob");
        list.add("Chris");
        list.add("Diana");
        System.out.println("== 4件追加後 ==");
        System.out.println("size : " + list.size());
        System.out.println("0 : " + list.get(0));
        System.out.println("1 : " + list.get(1));
        System.out.println("2 : " + list.get(2));
        System.out.println("3 : " + list.get(3));
        System.out.println();

        list.add("Elmo");
        System.out.println("== 5件目追加後 ==");
        System.out.println("size : " + list.size());
        System.out.println("0 : " + list.get(0));
        System.out.println("1 : " + list.get(1));
        System.out.println("2 : " + list.get(2));
        System.out.println("3 : " + list.get(3));
        System.out.println("4 : " + list.get(4));
        System.out.println();

        list.add("Fled");
        System.out.println("== 6件目追加後 ==");
        System.out.println("size : " + list.size());
        System.out.println("0 : " + list.get(0));
        System.out.println("1 : " + list.get(1));
        System.out.println("2 : " + list.get(2));
        System.out.println("3 : " + list.get(3));
        System.out.println("4 : " + list.get(4));
        System.out.println("5 : " + list.get(5));
    }
}

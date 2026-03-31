package Day8;

class Mol {
    int add(int a, int b) {
        System.out.println(a + b);
        return a + b;
    }

    int add(int a, int b, int c) {
        System.out.println(a + b + c);
        return a + b + c;
    }
}

public class Methodoverloading {
    public static void main(String[] args) {
        Mol m = new Mol();
        m.add(5, 3);
        m.add(2, 3, 1);
    }
}
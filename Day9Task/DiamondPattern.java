package Day9Task;

interface A {
    void show();
}

interface B extends A {}
interface C extends A {}

class D implements B, C {
    @Override
    public void show() {
        System.out.println("Implemented show() in D");
    }
}

public class DiamondPattern {
    public static void main(String[] args) {

        D obj1 = new D();
        obj1.show();

        A obj2 = new D();
        obj2.show();
    }
}
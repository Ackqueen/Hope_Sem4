package Day8;

class Mol {
    void calculate(int a, int b) {
        System.out.println("Parent class: Adding two numbers: " + (a + b));
    }
}

class MolChild extends Mol {
    @Override
    void calculate(int a, int b) {
        System.out.println("Child class: Adding two numbers: " + (a + b));
    }

    void calculate(int a, int b, int c) {
        System.out.println("Child class: Adding three numbers: " + (a + b + c));
    }
}

public class Methodoverriding {
    public static void main(String[] args) {
        Mol m = new Mol();
        m.calculate(5, 3);

        MolChild mc = new MolChild();
        mc.calculate(5, 3);
        mc.calculate(2, 3, 1);

        Mol m2 = new MolChild();
        m2.calculate(5, 3);
    }
}
package Package2;

import Package1.A;

public class B extends A { 
    public static void main(String[] args) {
        B b = new B();
        b.display(10); // ✅ correct
    }
}
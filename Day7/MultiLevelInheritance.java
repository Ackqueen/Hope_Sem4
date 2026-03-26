class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog says: Bow Bow...");
    }
}

class BabyDog extends Dog {
    void weep() {
        System.out.println("Weeping...");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {

        // Create object of BabyDog
        BabyDog bd = new BabyDog();

        // Access methods from all levels
        bd.eat();   // from Animal
        bd.bark();  // from Dog
        bd.weep();  // from BabyDog
    }
}
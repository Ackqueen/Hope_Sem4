

abstract class Animal {
    abstract void sound();
    
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Barks...");
    }
}

class Cat extends Animal { 
    @Override
    void sound() {
        System.out.println("Meow...");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Animal a = new Dog(); 
        a.eat();
        a.sound();
        
        Animal c = new Cat();
        c.eat();
        c.sound();
    }
}
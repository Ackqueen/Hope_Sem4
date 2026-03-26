class Animal{
    void displayanimal(){
        System.out.println("Chose one animal and mention its sound.");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog says: Bow Bow...");
    }
}

public class Inheritance {
    public static void main(String []args){
        Dog d = new Dog();
        d.bark();
        System.out.println(d.hashCode());
    }
}

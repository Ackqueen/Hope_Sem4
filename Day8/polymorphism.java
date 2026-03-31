package Day8;
class Animal{
    void sound(){
        System.out.println("All animals have differenr sound");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog will bark");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Cat meowssss]");
    }
}
public class polymorphism {
    public static void main(String []args){
        Animal a;
        a = new Cat();
        Dog d = new Dog();
        Cat c = new Cat();
    }
}

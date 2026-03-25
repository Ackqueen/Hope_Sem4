package Day6;

class Apartment{
    void display() {
        System.out.println("I am inside Apartment Class");
    }
}
public class ClassObject {
    public static void main(String[] args){
        Apartment a = new Apartment();
        a.display();
        System.out.println("I am inside class object");
    }
}

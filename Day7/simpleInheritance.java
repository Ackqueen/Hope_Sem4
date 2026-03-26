class parent{

    int x =10;

    void display(){
        System.out.println("Inside parent class");
    }
}

class child extends parent{
    void display1(){
        System.out.println("Inside child class called via parent class " + x);
    } 
}
    
public class simpleInheritance{
    public static void main(String[] args) {
        System.out.println("Inside main method");
        System.out.println();
        child c = new child();
        parent p = new parent();
        parent p1 = new child();
        p1.display();
        p.display();
        c.display1();
    }
}
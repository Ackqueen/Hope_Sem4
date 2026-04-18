package Day20;

interface method{
    default void display(){
        System.out.println("Welcome to interface method");
    }
}
class hello implements method{
    public void display(){
        System.out.println("Overrided the interface method implementation.");
    }
}

public class DefaultInterfaceIm{
    public static void main(String[] args) {
        hello h = new hello();
        h.display();
    }
}
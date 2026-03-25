package Day6;

class dConstructor {
    
    dConstructor(int x) {
        System.out.println("I am inside the Parameterized constructor");
    }

    void display() {
        System.out.println("Display method called");
    }
}

public class defaultConstructor {
    public static void main(String[] args) {
        dConstructor dc = new dConstructor(10);
        dc.display();
        System.out.println("See your class file is automatically created while compilation");
    }
}
package Day6;

class orConstructor{
    orConstructor(){
        System.out.println("This is a default constructor");
    }
    orConstructor(int i){
        System.out.println("This is a parameterized constructor and overloading input is integer");
    }
    orConstructor(String str){
        System.out.println("This is a parameterized constructor and overloading input is string");
    }
}

public class constructerOverloading {
    public static void main(String[] args) {
        orConstructor oc1 = new orConstructor();
        orConstructor oc2 = new orConstructor(10);
        orConstructor oc3 = new orConstructor("Hello");
    }
}

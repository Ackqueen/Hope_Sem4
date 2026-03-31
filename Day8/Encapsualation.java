package Day8;

class encap{
    int a = 90;

    void display(){
        System.out.println("Implementation of Encapsulation" + a);
    }
}
public class Encapsualation {
    public static void main(String[] args){
        encap e = new encap();
        e.display();
    }
}

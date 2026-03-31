interface a{
    void show();
}
interface b{
    void display();
}
class c implements a{
    public void show(){
        System.out.println("This is show method");
    }
}
public class InterfaceExample {
    public static void main(String []args){
        a cclass =  new c();
        cclass.show();
    }
}
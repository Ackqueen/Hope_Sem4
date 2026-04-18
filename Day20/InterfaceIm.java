package Day20;

interface Test {
    public void show(int a,int b);
}
public class InterfaceIm {
    public static void main(String[] args){
        Test obj = (a,b) -> System.out.println("Hello from Lambda Expression");
        obj.show(10,20);
    }
}

class parent1{
    void pdisplay(){
        System.out.print("Hello...");
    }
}
class child1 extends parent1{
    void cdisplay(){
        System.out.println("Hello from parent...");
    }
}
public class InheritanceEx {
    public static void main(String []args){
        parent1 p1 = new child1();// accesing parent class without using crating parent object;
        // child1 ch = new parent1(); Not possible 
        p1.pdisplay();
        // p1.cdisplay();  Not possible;
    }
}

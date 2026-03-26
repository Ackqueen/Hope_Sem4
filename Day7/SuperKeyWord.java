class super1{
    class superExample1{

        public superExample1() {
            System.out.println("Called is SuperExample1 by super keyword");
        }
        void hello(){
            System.out.print("Hiii Welcome");
        }
        
    }
    class superExample2 extends superExample1{

        public superExample2() {
            System.out.println("Called is SuperExample2 by super keyword");
        }
        void reject(){
            System.out.println("I haven't call you why did you come");
            super.hello();
        }
    }
}
public class SuperKeyWord {
    public static void main(String[] args) {

        super1 outer = new super1();

        System.out.println("Creating superExample2 Object");
        super1.superExample2 s = outer.new superExample2();

        System.out.println("Calling Methods");
        s.reject();
        System.out.println("Direct Parent Method Call");
        s.hello();
    }
}
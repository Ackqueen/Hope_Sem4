class Father{
     void display1(){
        System.out.println("I am Father I have a son and a daughter");
    }
}
class son extends Father{
    void job(){
        System.out.println("Since you are careless I will give my job to your sister");
    }
}
class daughter extends Father{
    void business(){
        System.out.println("Since I have a good business I will give my business to my brother");
    }
}
public class Hierarchical{
    public static void main(String[] args) {
        son s = new son();
        daughter d = new daughter();
        s.display1();
        s.job();
        d.display1();
        d.business();
    }
}
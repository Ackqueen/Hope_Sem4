package Day20;

interface CarEngine{
    static String Display(){
        return "Engine is designed with 3000rpm";
    }
}

public class staticInterface{
    public static void main(String[] args){
        String s = CarEngine.Display();
        System.out.print(s);
    }
}
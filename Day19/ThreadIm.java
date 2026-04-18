package Day19;

class Timer1 extends Thread{
    public void run(){
        try{
            for(int i=0;i<5;i++){
                System.out.println("Thread is running: "+i);
                Thread.sleep(50);
            }
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
class Timer2 extends Thread{
    public void run(){
        try{
            for(int i=0;i<5;i++){
                System.out.println("Thread is running: "+i);
                Thread.sleep(50);
            }
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
class Timer3 extends Thread{
    public void run(){
        try{
            for(int i=0;i<5;i++){
                System.out.println("Thread is running: "+i);
                Thread.sleep(50);
            }
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
public class ThreadIm {
    public static void main(String[] args) {
        Timer1 t1=new Timer1();
        Timer2 t2=new Timer2();
        t1.start();
        t2.start();
    }
}

package Day19;
class Timer1 implements Runnable{
    public void run(){
        try{
            for(int i=0;i<5;i++){
                System.out.println(Thread.currentThread().getName()+" is running: "+i);
                Thread.sleep(50);
            }
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
public class RunnableIm {
    public static void main(String[] args) {
        Thread t1=new Thread(new Timer1());
        Thread t2=new Thread(new Timer1());
        t1.start();
        t2.start();
    }
}

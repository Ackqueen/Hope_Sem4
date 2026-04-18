package Day20;

class Bank{
    int balance = 1000;
    synchronized void withdraw(int amount){
        if(balance >= amount){
            System.out.println(Thread.currentThread().getName() + " is withdrawing " + amount);
            balance -= amount;
            System.out.println("Remaining Balance: " + balance);
        }else{
            System.out.println("Insufficient Balance");
        }
    }
}

public class ConcurrencyIm {
    public static void main(String[] args){
        Bank b = new Bank();
        Runnable task = () -> {
            b.withdraw(700);
        };
        Thread t1 = new Thread(task, "User-1");
        Thread t2 = new Thread(task, "User-2");
        t1.start();
        t2.start();
    }
}

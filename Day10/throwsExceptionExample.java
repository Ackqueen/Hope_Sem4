package Day10;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}
class Bank{
    private double balance;
    void deposit(int amount) throws InsufficientBalanceException {
        if(amount < 0) {
            throw new InsufficientBalanceException("Deposit amount cannot be negative");
        }
        balance += amount;
    }
    void withdraw(int amount) throws InsufficientBalanceException {
        if(amount < 0) {
            throw new InsufficientBalanceException("Withdrawal amount cannot be negative");
        }
        if(amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance");
        }
        balance -= amount;
    }
}

public class throwsExceptionExample {
    public static void main(String[] args) {
        
    }
}
/*
class BankAccount{
    private double balance;
    void deposit(int amount){
        balance += amount;
        getBalance();
    }
    void withdraw(int amount){
        if(amount <= balance){
            balance -= amount;
            System.out.println("Amount withdrawed is: "+ amount);
        } else {
            System.out.println("Balance Insufficient");
        }
    }
    void getBalance(){
        System.out.println("Account Balance is: "+ balance);
    }
}
public class Bank {
    public static void main(String[] args) {
        BankAccount ksp = new BankAccount();
        ksp.deposit(500);
        ksp.withdraw(100);
        ksp.getBalance();
        BankAccount ksp1 = new BankAccount();
        ksp1.getBalance();
    }
}

*/
interface Payment {
    void pay(double amount);
}

abstract class Employee {
    abstract double getSalary();
}

class FullTime extends Employee {
    double getSalary() { 
        return 2000 * 20; 
    }
}

class PartTime extends Employee {
    double getSalary() { 
        return 300 * 50; 
    }
}

class UPI implements Payment {
    public void pay(double amount) { 
        System.out.println("Paid ₹" + amount + " via UPI"); 
    }
}

class Card implements Payment {
    public void pay(double amount) { 
        System.out.println("Paid ₹" + amount + " via Card"); 
    }
}

public class AbstractionInterfaceEmployee {
    public static void main(String[] args) {
        Employee emp = new FullTime();
        Payment method = new UPI();

        double salary = emp.getSalary();
        method.pay(salary);
    }
}
package Day10Task;

public class tryCatchTest2 {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; 
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Caught a general exception: " + e.getMessage());
        } catch (ArithmeticException e) { 
            // This block will never be reached because Exception is a parent class of ArithmeticException
            // If Exception already catches all exceptions why is this second block here?
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}

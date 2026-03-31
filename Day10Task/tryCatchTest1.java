/*
public class tryCatchTest {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; 
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Caught a general exception: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        } 
    }
}
*/
package Day10Task;

public class tryCatchTest1 {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; 
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) { // First matching class should be caught
            System.out.println("Caught an exception: " + e.getMessage());
        }catch (Exception e) {
            System.out.println("Caught a general exception: " + e.getMessage());
        } 
    }
}

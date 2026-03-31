package Day10;

public class CheckedException {
    public static void main(String[] args) {
        try {
            int a = 10/0;
        } catch (Exception e) {
            System.out.println("Can't divide by zero " + e);
        }
        try {
            int []arr = new int[5];
            System.out.println(arr[10]);
        }catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Array index is out of bounds " + ex);
        }finally {
            System.out.println("Code Execution Completed");
        }
    }
}
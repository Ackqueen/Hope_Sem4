package Day10;

public class throwException {
    public static void main(String[] args) {
        int age = 15;
        if(age <= 10) {
            throw new ArithmeticException("Not eligible to voting");
        }
    }
}

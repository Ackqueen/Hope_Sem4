package Day3;

import java.util.Scanner;

class LeetCode7 {
    public int reverse(int x) {
        int rev = 0;

        while (x != 0) {
            int digit = x % 10;
            x /= 10;

            // overflow check
            if (rev > Integer.MAX_VALUE / 10 || 
                rev < Integer.MIN_VALUE / 10) {
                return 0;
            }

            rev = rev * 10 + digit;
        }

        return rev;
    }
    public static void main(String[] args) {
        LeetCode7 solution = new LeetCode7();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer to reverse: ");
        int input = scanner.nextInt();
        int result = solution.reverse(input);
        System.out.println("Reversed integer: " + result);
    }
}
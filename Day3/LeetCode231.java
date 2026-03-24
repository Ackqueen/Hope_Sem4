package Day3;

import java.util.Scanner;

public class LeetCode231 {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0)
            return false;

        while (n % 2 == 0) {
            n /= 2;
        }
        return n == 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LeetCode231 s = new LeetCode231();
        System.out.println(s.isPowerOfTwo(n));
    }
}

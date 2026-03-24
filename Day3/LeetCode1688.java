package Day3;

import java.util.*;

class LeetCode1688 {
    public int numberOfMatches(int n) {
        return n-1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LeetCode1688 solution = new LeetCode1688();
        int n = scanner.nextInt();
        int result = solution.numberOfMatches(n);
        System.out.println(result);
    }
}
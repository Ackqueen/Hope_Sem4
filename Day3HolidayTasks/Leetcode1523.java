import java.util.*;

class LeetCode1523 {
    public int countOdds(int low, int high) {
        int count = (high - low)/2;
        if (low%2 == 1 || high%2 == 1) {
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LeetCode1523 sol = new LeetCode1523();
        int low = sc.nextInt();
        int high = sc.nextInt();
        System.out.println(sol.countOdds(low, high));
    }
}

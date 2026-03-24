import java.util.*;

class LeetCode292 {
    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }
    public static void main(String[] args) {
        LeetCode292 solution = new LeetCode292();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution.canWinNim(n));
    }
}
package Day16;

public class LeetCode70 {
    public int climbStairs(int n) {
        int first =1;
        int second = 2;
        int third;
        if (n<=2) return n;
        for (int i = 3 ; i<n+1; i++){
            third = first + second;
            first = second;
            second = third;
        }
        return second;
        
    }
    public static void main(String[] args) {
        LeetCode70 solution = new LeetCode70();
        int n = 5;
        int result = solution.climbStairs(n);
        System.out.println(result);
    }
}

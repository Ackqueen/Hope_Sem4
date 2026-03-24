import java.util.*;

class LeetCode268 {
    public int missingNumber(int[] nums) {
        int xor = nums.length;

        for(int i = 0; i < nums.length; i++){
            xor ^= i ^ nums[i];
        }

        return xor;
    }
    public static void main(String[] args) {
        LeetCode268 solution = new LeetCode268();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println(solution.missingNumber(nums));
    }
}
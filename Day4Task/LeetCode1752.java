import java.util.Scanner;
class LeetCode1752 {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
            if (count > 1) return false;
        }

        return true;
    }
    public static void main(String[] args) {
        LeetCode1752 solution = new LeetCode1752();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        boolean result = solution.check(nums);
        System.out.println(result);

        scanner.close();
    }
}
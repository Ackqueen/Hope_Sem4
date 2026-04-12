package Day15;

public class LeetCode169 {
    public int majorityElement(int[] nums) {
    int len = nums.length;
    for (int i = 0; i < len; i++) {
        int count = 0;
        for (int j = 0; j < len; j++) {
            if (nums[i] == nums[j]) {
                count++;
            }
        }
        if (count > len / 2) {
            return nums[i];
        }
    }
    return -1;
    }
    public static void main(String[] args) {
        LeetCode169 solution = new LeetCode169();
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int result = solution.majorityElement(nums);
        System.out.println(result);
    }
}

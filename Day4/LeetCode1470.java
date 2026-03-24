class LeetCode1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        int index = 0;

        for (int i = 0; i < 2 * n; i += 2) {
            result[i] = nums[index];
            result[i + 1] = nums[index + n];
            index++;
        }
        return result;
    }

    public static void main(String[] args) {
        LeetCode1470 solution = new LeetCode1470();
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;

        int[] result = solution.shuffle(nums, n);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
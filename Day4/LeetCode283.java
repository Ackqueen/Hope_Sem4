class LeetCode283 {
    public void moveZeroes(int[] nums) {
        int cnt = 0;
        int n = nums.length;
        int index = 0;
        for(int i=0; i<n; i++){
            if(nums[i]!=0){
                nums[index++] = nums[i];
            }
        }
        for(int i = index; i<n; i++){
            nums[i] = 0;
        }
    }
    public static void main(String[] args) {
        LeetCode283 solution = new LeetCode283();
        int[] nums = {0, 1, 0, 3, 12};
        solution.moveZeroes(nums);
        System.out.print("Result: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
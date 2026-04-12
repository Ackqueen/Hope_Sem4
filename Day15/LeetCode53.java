package Day15;

public class LeetCode53 {
    public int maxSubArray(int[] nums) {
        int currsum = 0;
        int maxsum = nums[0];

    /*for (int i = 1; i < nums.length; i++) {
        currentSum = Math.max(nums[i], currentSum + nums[i]);
        maxSum = Math.max(maxSum, currentSum);
    }   

    return maxSum;
    */
        for(int i=0; i<nums.length; i++){
            currsum += nums[i];
            if(maxsum < currsum){
                maxsum = currsum;
            }
            if(currsum < 0){
                currsum = 0;
            }
        }
        return maxsum;
    }
    public static void main(String[] args) {
        LeetCode53 solution = new LeetCode53();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int result = solution.maxSubArray(nums);
        System.out.println(result);
    }
}

package Day6Task;

import java.util.Arrays;

public class LeetCode41 {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int i=0,ctr = 1;
        while(i<nums.length && nums[i]<=0){
            i++;
        }
        for(;i<nums.length; i++){
            if(nums[i] > ctr){
                return ctr;
            }
            else if(nums[i] == ctr){
                ctr++;
            }
        }
        return ctr;
    }
    public static void main(String[] args) {
        LeetCode41 obj = new LeetCode41();
        int[] nums = {3,4,-1,1};
        System.out.println(obj.firstMissingPositive(nums));
    }
}
package Day13;

import java.util.Arrays;

public class LeetCode217 {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i++){
            if( nums[i]==nums[i+1])
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        LeetCode217 leetCode217 = new LeetCode217();
        int[] nums = {1,2,3,1};
        System.out.println(leetCode217.containsDuplicate(nums));
    }
}

package Day13;

import java.util.HashMap;

public class LeetCode219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) 
                return true;
            map.put(nums[i], i);
        }
        return false;
    }
    public static void main(String[] args) {
        LeetCode219 leetCode219 = new LeetCode219();
        int[] nums = {1,2,3,1};
        int k = 3;
        System.out.println(leetCode219.containsNearbyDuplicate(nums, k));
    }
}

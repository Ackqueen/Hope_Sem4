package Day3;

import java.util.Scanner;

class LeetCode1822 {
    public int arraySign(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0)
                return 0;
            if(nums[i]<0)
                count++;
        }
        if(count%2==1)
            return -1;
        return 1;
    }
    public static void main(String[] args) {
        LeetCode1822 obj = new LeetCode1822();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(obj.arraySign(nums));
    }
}
import java.util.Scanner;

// class Solution {
//     int digitscount(int num){
//         int dc = 0;
//         while(num>0){
//             dc++;
//             num/=10;
//         }
//         return dc;
//     }
//     public int findNumbers(int[] nums) {
//         int count = 0;
//         for(int i=0; i<nums.length; i++){
//             if(digitscount(nums[i])%2 == 0)
//                 count++;
//         }
//         return count;
//     }
// }

class LeetCode1295 {
    public int findNumbers(int[] nums){
        int count = 0;
        for(int i : nums){
            if(Integer.toString(i).length()%2==0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        LeetCode1295 obj = new LeetCode1295();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(obj.findNumbers(nums));
    }
}
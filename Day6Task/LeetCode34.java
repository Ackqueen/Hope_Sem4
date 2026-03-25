package Day6Task;

class LeetCode34 {
    public int[] searchRange(int[] nums, int target) {
        int [] arr = new int[2];
        arr[0] = -1;
        arr[1] = -1;
        int len = nums.length;
        for(int i = 0;i<len; i++){
            if(nums[i] == target){
                arr[0] = i;
                break;
            }   
        }
        for(int i=len-1; i<=0; i++){
            if(nums[i] == target){
                arr[1] = i;
                break;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        LeetCode34 obj = new LeetCode34();
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] res = obj.searchRange(nums, target);
        System.out.println("["+res[0]+","+res[1]+"]");
    }
}

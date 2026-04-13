package Day16;

public class LeetCode1518 {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalBottles = numBottles;
        while(numBottles >= numExchange){
            int newBottles  = numBottles/numExchange;
            totalBottles += newBottles;
            numBottles = newBottles + (numBottles%numExchange);
        }
        return totalBottles;
    }
    public static void main(String[] args) {
        LeetCode1518 solution = new LeetCode1518();
        int numBottles = 9;
        int numExchange = 3;
        int result = solution.numWaterBottles(numBottles, numExchange);
        System.out.println(result); // Output: 13
    }    
}

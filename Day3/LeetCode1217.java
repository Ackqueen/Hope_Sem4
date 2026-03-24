package Day3;

import java.util.*;

class LeetCode1217 {
    public int minCostToMoveChips(int[] position) {
        int even = 0, odd = 0;
        for(int i : position){
            if(i%2==0){
                even++;
            }
            if(i%2==1){
                odd++;
            }
        }
        return Math.min(even,odd);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LeetCode1217 l = new LeetCode1217();
        int[] position = new int[sc.nextInt()];
        for(int i=0; i<position.length; i++){
            position[i] = sc.nextInt();
        }
        System.out.println(l.minCostToMoveChips(position));
    }
}
package Day3;

import java.util.Scanner;

class LeetCode191 {
    public int hammingWeight(int n) {
        int count = 0;
        while(n>0){
            count++;
            n = n & ( n - 1);
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LeetCode191 s = new LeetCode191();
        System.out.println(s.hammingWeight(n));
    }
}
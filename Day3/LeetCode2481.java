package Day3;

import java.util.Scanner;

public class LeetCode2481 {
    public int numberOfCuts(int n) {
        if(n==1)
            return 0;
        if(n%2==0)
            return n/2;
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LeetCode2481 s = new LeetCode2481();
        System.out.println(s.numberOfCuts(n));
    }
}

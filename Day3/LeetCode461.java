package Day3;

import java.util.Scanner;

class LeetCode461 {
    public int hammingDistance(int x, int y) {
        int xor = x ^ y;
        return countSetBits(xor);
    }
    public int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            count += n & 1; 
            n >>= 1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        LeetCode461 s = new LeetCode461();
        System.out.println(s.hammingDistance(x, y));
    }
}
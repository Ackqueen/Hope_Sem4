package Day3;

import java.util.Scanner;

class Leetcode1025 {
    public boolean divisorGame(int n) {
        if(n%2==0)
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Leetcode1025 l = new Leetcode1025();
        int n = sc.nextInt();
        System.out.println(l.divisorGame(n));
    }
}
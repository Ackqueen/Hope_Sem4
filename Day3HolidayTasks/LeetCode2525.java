import java.util.*;

class LeetCode2525 {
    public String categorizeBox(int length, int width, int height, int mass) {
        long volume = (long) length * width * height;

        boolean bulky = (length >= 10000 || width >= 10000 || height >= 10000) 
                        || volume >= 1000000000;

        boolean heavy = mass >= 100;

        if (bulky && heavy) return "Both";
        if (bulky) return "Bulky";
        if (heavy) return "Heavy";
        return "Neither";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LeetCode2525 sol = new LeetCode2525();
        int length = sc.nextInt();
        int width = sc.nextInt();
        int height = sc.nextInt();
        int mass = sc.nextInt();
        System.out.println(sol.categorizeBox(length, width, height, mass));
    }
}
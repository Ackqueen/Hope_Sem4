package Day16;

public class LeetCode319 {
    public int bulbSwitch(int n) {
        return (int)Math.sqrt(n);
    }
    public static void main(String[] args) {
        LeetCode319 solution = new LeetCode319();
        int n = 3;
        int result = solution.bulbSwitch(n);
        System.out.println(result);
    }
}

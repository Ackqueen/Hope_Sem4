import java.util.Arrays;

class LeetCode242 {
    public boolean isAnagram(String s, String t) {
        char []sarr = s.toCharArray();
        char []tarr = t.toCharArray();
        Arrays.sort(sarr);
        Arrays.sort(tarr);
        return (new String(sarr) .equals(new String(tarr)));
    }
    public static void main(String[] args) {
        LeetCode242 solution = new LeetCode242();
        String s = "anagram";
        String t = "nagaram";
        boolean result = solution.isAnagram(s, t);
        System.out.println("Is Anagram: " + result);
    }
}
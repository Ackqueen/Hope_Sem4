
public class LeetCode125 {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("\\s", "");
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        String str = new StringBuilder(s).reverse().toString();
        return s.equals(str);
    }
    public static void main(String[] args) {
        LeetCode125 solution = new LeetCode125();
        String s = "A man, a plan, a canal: Panama";
        boolean result = solution.isPalindrome(s);
        System.out.println("Is Palindrome: " + result);
    }

}

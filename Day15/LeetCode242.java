package Day15;

public class LeetCode242 {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        int []freq = new int[26];
        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }
        for(int i=0; i<freq.length; i++){
            if(freq[i]!=0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        LeetCode242 solution = new LeetCode242();
        String s = "anagram";
        String t = "nagaram";
        boolean result = solution.isAnagram(s, t);
        System.out.println(result);
    }
}

package Day16;

import java.util.HashMap;
import java.util.Map;

public class LeetCode387 {
    public int firstUniqChar(String s) {
        // int []freq = new int[26];
        // for(int i=0; i<s.length(); i++){
        //     freq[s.charAt(i)-'a']++;
        // }
        // for(int i=0; i<s.length(); i++){
        //     if(freq[s.charAt(i)-'a'] == 1)
        //         return i;
        // }
        // return -1;
        Map<Character,Integer> freq = new HashMap<>();
        for(char ch:s.toCharArray()){
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
        for(int i=0; i<s.length(); i++){
            if(freq.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        LeetCode387 solution = new LeetCode387();
        String s = "leetcode";
        int result = solution.firstUniqChar(s);
        System.out.println(result);
    }
}
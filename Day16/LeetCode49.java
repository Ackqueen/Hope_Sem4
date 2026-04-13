package Day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> result = new HashMap<>();
        int strslen = strs.length; 
        for(int i=0; i<strslen; i++){
            char []charr = strs[i].toCharArray();
            Arrays.sort(charr);
            String key = new String(charr);
            if(!result.containsKey(key)){
                result.put(key,new ArrayList<>());
            }
            result.get(key).add(strs[i]);
        }
        return new ArrayList<>(result.values());
    }
    public static void main(String[] args) {
        LeetCode49 solution = new LeetCode49();
        String []strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result = solution.groupAnagrams(strs);
        System.out.println(result);
    }
}

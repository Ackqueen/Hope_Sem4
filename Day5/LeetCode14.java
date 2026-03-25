package Day5;

class LeetCode14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
            if (prefix.length() == 0) {
                return "";
            }
        }
        return prefix;
    }
    public static void main(String[] args) {
        LeetCode14 solution = new LeetCode14();
        String[] strs = {"flower","flow","flight"};
        String result = solution.longestCommonPrefix(strs);
        System.out.println(result);
    }
}

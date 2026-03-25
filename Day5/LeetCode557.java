package Day5;

class LeetCode557 {
    public String reverseWords(String s) {
        String[] strs = s.split(" ");
        
        for(int i = 0; i < strs.length; i++){
            strs[i] = new StringBuilder(strs[i]).reverse().toString();
        }
        
        return String.join(" ", strs);
    }
    public static void main(String[] args) {
        LeetCode557 solution = new LeetCode557();
        String s = "Let's take LeetCode contest";
        String result = solution.reverseWords(s);
        System.out.println(result);
    }
}


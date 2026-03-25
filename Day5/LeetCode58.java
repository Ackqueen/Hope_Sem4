package Day5;

class LeetCode58 {
    public int lengthOfLastWord(String s) {
        int len = 0, i = s.length() - 1;

        while (i >= 0 && s.charAt(i) == ' ')
            i--;
        while (i >= 0 && s.charAt(i) != ' ') {
            len++;
            i--;
        }
        return len;
    }
    public static void main(String[] args) {
        LeetCode58 solution = new LeetCode58();
        String s = "Hello World";
        int result = solution.lengthOfLastWord(s);
        System.out.println(result);
    }
}
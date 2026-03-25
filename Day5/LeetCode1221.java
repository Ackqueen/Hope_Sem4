package Day5;

class LeetCode1221 {
    public int balancedStringSplit(String s) {
        int balance = 0;
        int count = 0;

        for(char c : s.toCharArray()){
            if(c == 'L') balance++;
            else balance--;

            if(balance == 0){
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        LeetCode1221 solution = new LeetCode1221();
        String s = "RLRRLLRLRL";
        int result = solution.balancedStringSplit(s);
        System.out.println(result);
    }
}
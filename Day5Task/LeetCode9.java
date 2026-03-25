class LeetCode9 {
    public boolean isPalindrome(int x) {
        int reversed = 0;
        int input = x;
        while( input > 0){
            int digit = input%10;
            reversed = reversed * 10 + digit;
            input/=10;
        }
        return reversed == x;
    }
    public static void main(String[] args) {
        LeetCode9 solution = new LeetCode9();
        int x = 121;
        boolean result = solution.isPalindrome(x);
        System.out.println(result);
    }
}
package Day5;

class LeetCode344 {
    public void reverseString(char[] s) {
        int st = 0 ; int end = s.length -1;
        while(st<=end){
            char temp = s[st];
            s[st] = s[end];
            s[end]= temp;
            st++;
            end-- ;
        }
    }
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        LeetCode344 sol = new LeetCode344();
        sol.reverseString(s);
        System.out.println(s);
    }
}
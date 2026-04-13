package Day16;

public class LeetCode263 {
    public boolean isUgly(int n) {
        if(n==0)
            return false;
        int []factors = {2,3,5};
        for(int i=0; i<=2; i++){
            while(n%factors[i]==0){
                n/=factors[i];
            }
        }
        return n==1;
    }
    public static void main(String[] args) {
        LeetCode263 solution = new LeetCode263();
        int n = 6;
        boolean result = solution.isUgly(n);
        System.out.println(result);
    }
}
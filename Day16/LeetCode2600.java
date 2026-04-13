package Day16;

public class LeetCode2600 {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if(k<=numOnes) return k;
        else if( k <= (numOnes+numZeros)) return numOnes;
        else return (numOnes -(k- (numOnes +  numZeros)));
    }
    public static void main(String[] args) {
        LeetCode2600 solution = new LeetCode2600();
        int numOnes = 3;
        int numZeros = 2;
        int numNegOnes = 1;
        int k = 4;
        int result = solution.kItemsWithMaximumSum(numOnes, numZeros, numNegOnes, k);
        System.out.println(result);
    }
}

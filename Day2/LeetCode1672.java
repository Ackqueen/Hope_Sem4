import java.util.*;

class LeetCode1672 {
    public int maximumWealth(int[][] accounts) {
        int row = accounts.length;
        int col = accounts[0].length;
        int wealth = 0;
        for(int i=0; i<row; i++){
            int sum = 0;
            for(int j=0; j<col; j++){
                sum += accounts[i][j];
            }
            if(sum > wealth)
                wealth = sum;
            sum = 0;
        }
    return wealth;
    }
    public static void main(String[] args) {
        LeetCode1672 solution = new LeetCode1672();
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] accounts = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                accounts[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution.maximumWealth(accounts));
    }
}
import java.util.Scanner;
class LeetCode941 {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        if (n < 3) return false;
        int i = 0;
        while (i + 1 < n && arr[i] < arr[i + 1]) {
            i++;
        }

        if (i == 0 || i == n - 1) return false;
        while (i + 1 < n && arr[i] > arr[i + 1]) {
            i++;
        }
        return i == n - 1;
    }
    public static void main(String[] args) {
        LeetCode941 solution = new LeetCode941();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        boolean result = solution.validMountainArray(arr);
        System.out.println(result);
    }
}
package Day6Task;

class LeetCode66 {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            
            digits[i] = 0;
        }

        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
    public static void main(String[] args) {
        LeetCode66 obj = new LeetCode66();
        int[] digits = {9, 9, 9};
        int[] res = obj.plusOne(digits);
        System.out.print("[");
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
            if (i < res.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

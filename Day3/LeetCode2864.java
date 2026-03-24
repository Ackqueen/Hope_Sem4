import java.util.*;

class LeetCode2864
{
    public String maximumOddBinaryNumber(String s) {
        int ones = 0;
        int len = s.length();
        StringBuilder sb = new StringBuilder();

        for(char ch : s.toCharArray()){
            if(ch == '1') ones++;
        }

        for(int i = 0; i < ones - 1; i++)
            sb.append('1');

        for(int i = 0; i < len - ones; i++)
            sb.append('0');

        sb.append('1');

        return sb.toString();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter binary string: ");
        String s = sc.next();

        LeetCode2864 obj = new LeetCode2864();
        String result = obj.maximumOddBinaryNumber(s);

        System.out.println("Maximum Odd Binary Number: " + result);
    }
}
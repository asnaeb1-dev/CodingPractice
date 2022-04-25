package POTD;

/**
 * 23-01-2022
 *
 * Question:
 * Given a string containing uppercase alphabets and integer digits (from 0 to 9),
 * the task is to print the alphabets in the lexicographical order followed by the sum of digits.
 *
 * Example 1:
 *
 * Input: S = "AC2BEW3"
 * Output: "ABCEW5"
 * Explanation: 2 + 3 = 5 and we print all
 * alphabets in the lexicographical order.
 */
public class RearrangeStrings {
    public static void main(String[] args) {
        String s ="ACCBA10D2EW30";
        System.out.println(arrangeString(s));
    }
    public static String arrangeString(String s){
        //code here.
        int[] count = new int[26];
        int n = s.length();
        int sum = 0;
        for(int i = 0;i<n;i++){
            char ch = s.charAt(i);
            if(ch >=65 && ch <= 91){
                count[ch - 'A']++;
            }else if(ch >=48 && ch <=57){
                sum+= Integer.parseInt(String.valueOf(ch));
            }
        }

        s = "";
        for(int i = 0;i<26;i++){
            int temp = count[i];
            while(temp != 0){
                s+=(char) (i + 65);
                temp--;
            }
        }
        s+=sum;
        return s;
    }
}

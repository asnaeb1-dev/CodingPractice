package Strings;

/**Questions:
 * Given a binary string str of length N,
 * the task is to find the maximum count of consecutive substrings str can
 * be divided into such that all the substrings are balanced
 * i.e. they have equal number of 0s and 1s. If it is not possible to split str satisfying the conditions then print -1.
 * Example:
 *
 *
 * Input: str = “0100110101”
 * Output: 4
 * The required substrings are “01”, “0011”, “01” and “01”.
 * Input: str = “0111100010”
 * Output: 3
 */
public class SplitBinaryStringIntoSubstrings {
    public static void main(String[] args) {
        String binary = "010101010011110000";
        System.out.println(split(binary, binary.length()));
    }
    private static int split(String bin, int n){
        if(n == 0) return -1;
        if(n == 1) return 0;
        int count_0 = 0, count_1 = 0;

        int i = 0;
        int count = 0;
        for(;i<n;i++){
            if(bin.charAt(i) == '0'){
                count_0++;
            }else{
                count_1++;
            }

            if(count_0 == count_1){
                count++;
            }
        }
        return count;
    }
}

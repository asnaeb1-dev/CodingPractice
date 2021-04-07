package QueueDS;

import java.util.ArrayList;

/**Q
 * Given a number N. The task is to generate and print all binary numbers with decimal values from 1 to N.
 *
 * Example 1:
 *
 * Input:
 * N = 2
 * Output:
 * 1 10
 * Explanation:
 * Binary numbers from
 * 1 to 2 are 1 and 10.
 *
 * Example 2:
 *
 * Input:
 * N = 5
 * Output:
 * 1 10 11 100 101
 * Explanation:
 * Binary numbers from
 * 1 to 5 are 1 , 10 , 11 , 100 and 101.
 */
public class GenerateBinaryNumbers {
    private static ArrayList<String> generate(int N)
    {
        // Your code here
        ArrayList<String> al = new ArrayList<>();
        for(int i = 1;i<=N;i++){
            al.add(Integer.toBinaryString(i));
        }
        return al;
    }

    public static void main(String[] args) {
        for(String i : generate(5)){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

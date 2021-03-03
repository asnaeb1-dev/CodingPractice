package Hashing;

import java.util.LinkedHashMap;
import java.util.Map;

/**Question
 * Given an array of names (consisting of lowercase characters) of candidates in an election.
 * A candidate name in array represents a vote casted to the candidate. Print the name of candidate that received Max votes.
 * If there is tie, print lexicographically smaller name.
 *
 * Example 1:
 *
 * Input:
 * N = 13
 * Votes[] = {john,johnny,jackie,johnny,john
 * jackie,jamie,jamie,john,johnny,jamie,
 * johnny,john}
 * Output: john 4
 * Explanation: john has 4 votes casted for
 * him, but so does johny. john is
 * lexicographically smaller, so we print
 * john and the votes he received.
 * Example 2:
 *
 * Input:
 * N = 3
 * Votes[] = {andy,blake,clark}
 * Output: andy 1
 * Explanation: All the candidates get 1
 * votes each. We print andy as it is
 * lexicographically smaller.
 */

public class WinnerOfElection {
    public static void main(String[] args) {
        String[] s = {"andy", "blake", "clark"};
        String[] r = winner(s, s.length);
        for(int i = 0;i<r.length;i++){
            System.out.println(r[i]);
        }
    }
    public static String[] winner(String arr[], int n)
    {
        // add your code
        String[] r = new String[2];
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        for(int i = 0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }

        int max = -1;
        String st = "";
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
                st = entry.getKey();
            }else if(entry.getValue() == max){
                int i = st.compareTo(entry.getKey());
                if(i > 0){
                    max = entry.getValue();
                    st = entry.getKey();
                }
            }
        }
        r[0] = st;
        r[1] = String.valueOf(max);
        return r;
    }
}

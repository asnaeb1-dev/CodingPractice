package Strings;

import java.util.ArrayList;
import java.util.Arrays;

/**Question
 * You are given a string S of lowercase characters, find the rank of the string amongst its permutations when sorted lexicographically. Return 0 if the characters are repeated in the string.
 * Note: Return the rank%1000000007 as the answer as rank might overflow.
 *
 * Example 1:
 *
 * Input:
 * S = abc
 * Output: 1
 * Explanation: In 'abc' when we sort all the
 * permutations in lexicographic order 'abc'
 * will be at the first position.
 * Example 2:
 *
 * Input:
 * S = acb
 * Output: 2
 * Explanation: In 'acb' .The
 * lexicographically sorted permutations
 * with letters 'a', 'c', and 'b' will be
 * at second position.
 */

public class LexicographicRankOfString {
    public static void main(String[] args) {
        String str = "bac";
        //System.out.println(getLexicographicRank(str));
        System.out.println(getLexRank(str));
    }
    //O(n + n!)
    //Naive approach
    private static int getLexicographicRank(String str){
        char[] s = str.toCharArray();
        Arrays.sort(s);
        String temp = String.valueOf(s);
        ArrayList<String> al = new ArrayList<>();
        findAllPermutations(temp, al, 0, str.length() - 1);
        for(int i = 0;i< al.size();i++){
            if(al.get(i).equals(str)){
                return i + 1;
            }
        }
        return  -1;
    }

    private static void findAllPermutations(String str, ArrayList<String> list, int start, int end){
        if(start == end){
            list.add(str);
            return;
        }
        for(int i = start;i<=end;i++){
            str = swap(str, start, i);
            findAllPermutations(str, list,start + 1, end);
            str = swap(str, start, i);
        }
    }
    private static String swap(String s, int i, int j){
        char temp;
        char[] charArray = s.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    //Efficient
    private static int getLexRank(String str){
        int[] ref = new int[str.length()];
        Arrays.fill(ref, 0);
        for(int i = 0;i<str.length() - 1;i++){
            for(int j = i + 1;j<str.length();j++){
                if(str.charAt(i) > str.charAt(j)){
                    ref[i]++;
                }

            }
        }
        int fact = 1;
        for(int i = 1;i<str.length() ;i++){
            fact*=i;
        }
        int rank = ref[0] * fact;
        int div = str.length() - 1;
        for(int i = 1;i<str.length() && div>0;i++, div--){
            fact = fact/div;
            rank+= ref[i] * (fact);
        }
        return rank + 1;
    }
}

package Strings;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Question -->
 * Given a string S consisting of uppercase and lowercase characters.
 * The task is to sort uppercase and lowercase letters separately such that if
 * the ith place in the original string had an Uppercase character then it should not
 * have a lowercase character after being sorted and vice versa.
 *
 * Example 1:
 *
 * Input:
 * N = 12
 * S = defRTSersUXI
 * Output: deeIRSfrsTUX
 * Explanation: Sorted form of given string
 * with the same case of character as that
 * in original string is deeIRSfrsTUX
 */
public class CaseSpecificSorting {
    public static void main(String[] args) {
        String str = "aBhigyAN";
        String res = caseSort(str);
        System.out.println(res);
    }
    public static String caseSort(String str){
        // Your code here
        ArrayList<Character> lowerCase = new ArrayList<>();
        ArrayList<Character> upperCase = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch >= 65 && ch <= 91){
                upperCase.add(ch);
            }
            if(ch >=97 && ch <= 122){
                lowerCase.add(ch);
            }
        }
        Collections.sort(lowerCase);
        Collections.sort(upperCase);
        int l = 0, r = 0;
        for(int i= 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch >= 65 && ch <= 91){
                sb.append(upperCase.get(l++));
            }
            if(ch >=97 && ch <= 122){
                sb.append(lowerCase.get(r++));
            }
        }
        return sb.toString();
    }
}

package Strings;

import java.util.Arrays;

public class MinimumIndexedCharacter {
    public static void main(String[] args) {
        System.out.println(minimum("geeksforgeeks", "set"));
    }
    private static int minimum(String str, String pat){
        int[] count = new int[26];
        int[] count2 = new int[26];

        Arrays.fill(count, 0);
        Arrays.fill(count2, 0);

        for(int i = 0;i<str.length();i++){
            count[str.charAt(i) - 97]++;
        }

        for(int i = 0;i<pat.length();i++){
            count2[pat.charAt(i) - 97]++;
        }
        int p = -1;
        for (int i = 0;i<count.length;i++){
            if(count[i] > 0 && count2[i] > 0){
                p = i;
                break;
            }
        }

        char c = (char) (p+97);
        for(int i = 0;i<str.length();i++){
            if( c == str.charAt(i)){
                return i;
            }
        }

        return -1;
    }
}

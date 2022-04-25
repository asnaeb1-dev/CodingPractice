package Strings;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] str = {"flower", "flow", "flowering"};
        System.out.println(lcp(str, str.length));
    }
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder();
        String str = strs[0];
        int k = 0;
        while(k != str.length()){
            for(int i = 1;i<strs.length;i++){
                if(k < strs[i].length()){
                    if(str.charAt(k) != strs[i].charAt(k)){
                        return prefix.toString();
                    }
                }else{
                    return prefix.toString();
                }
            }
            prefix.append(str.charAt(k));
            k++;
        }
        return prefix.toString();
    }

    //using sorting
    //time - O(MAX * n log n)
    private static String lcp(String[] arr, int n) {
        if(n == 0) return "";
        if(n == 1) return arr[0];

        Arrays.sort(arr);
        int end = Math.min(arr[0].length(), arr[arr.length - 1].length());

        int i = 0;
        while(i < end){
            if(arr[0].charAt(i) == arr[arr.length - 1].charAt(i)){
                i++;
            }else{
                break;
            }
        }

        return arr[0].substring(0, i);
    }
}

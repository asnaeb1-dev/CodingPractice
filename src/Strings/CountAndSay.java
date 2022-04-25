package Strings;

import java.util.Arrays;

public class CountAndSay {
    public static void main(String[] args) {
        int n = 5;
        String res = rec("1",n);
        System.out.println(res);
    }
    public static String countAndSay(int n) {
        int i = 2;
        StringBuilder sb = new StringBuilder("");
        String x = String.valueOf(1);
        for(;i<=n;i++){
            int j = 0, k = 1;
            int count = 1;
            while(j <= k && k < x.length()){
                if(j == k){
                    k++;
                }
                else if(x.charAt(j) == x.charAt(k)){
                    k++;
                    count++;
                }else{
                    sb.append(count).append(x.charAt(j));
                    j = k;
                    count = 1;
                }
            }
            if(k == x.length()){
                sb.append(count).append(x.charAt(j));
            }
            if(sb.length() == 0){
                sb.append(count).append(x.charAt(j));
            }
            x = sb.toString();
            sb = new StringBuilder("");
        }

        return x;
    }

    private static String rec(String s, int n){
        if(n == 1) return s;
        int j = 0, k = 0;
        int c = 1;
        StringBuilder sb = new StringBuilder();
        while(j <= k && k < s.length()){
            if(j == k){
                k++;
            }else if(s.charAt(j) == s.charAt(k)){
                c++;
                k++;
            }else{
                sb.append(c).append(s.charAt(j));
                j = k;
                c = 1;
            }
        }
        if(k == s.length()){
            sb.append(c).append(s.charAt(j));
        }

        return rec(sb.toString(), n-1);
    }
}

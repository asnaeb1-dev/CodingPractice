package Strings;

public class CheckIfSubsequence {
    public static void main(String[] args) {
        String s1 = "abhigyan";
        String s2 = "ahn";
        System.out.println(isSubseqence(s1, s2, s1.length(), s2.length()));
    }
    private static boolean isSubseqence(String s1, String s2, int n, int m){
        if(n == 0 && m == 0)return true;
        if(n == 0) return false;
        if(m == 0) return true;
        if(s1.charAt(n - 1) == s2.charAt(m - 1)){
            return isSubseqence(s1, s2, n - 1, m - 1);
        }
        return isSubseqence(s1, s2, n - 1, m);
    }
    public static boolean isSubSequence(String A, String B){
        //code here
        int i = 0, j = 0;
        while(i != B.length() && j != A.length()){
            if(A.charAt(j) == B.charAt(i)){
                i++;
                j++;
            }else{
                i++;
            }
        }
        if(j != A.length()){
            return false;
        }
        return true;
    }
}

package DynamicProgramming;

public class StringInterleave {
    private static boolean isInterleave(String s1, String s2, String c){
        return checkOne(s1, c, s1.length(), c.length()) && checkOne(s2, c, s2.length(), c.length());
    }

    private static boolean checkOne(String s1, String c, int n, int m){
        if(n == 0 && m == 0) return true;
        if(m != 0 && n == 0) return true;
        if(m == 0 && n != 0) return false;
        if(s1.charAt(n - 1) == c.charAt(m - 1)){
            return checkOne(s1, c, n - 1, m - 1);
        }
        return checkOne(s1, c, n, m - 1);
    }

    public static void main(String[] args) {
        String s1 = "cab";
        String s2 = "acb";
        String c = "acbabc";
        System.out.println(isInterleave(s1, s2, c));
    }
}

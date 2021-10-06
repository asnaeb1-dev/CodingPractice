package DynamicProgramming;

public class StringInterleave {
    private static boolean isInterleave(String a, String b, String c, int l, int m, int n){
        if(l == 0){
            return true;
        }
        if(n == 0 || m == 0) return false;
        if(a.charAt(l - 1) == c.charAt(n - 1)){
            return isInterleave(a, b, c, l -1, m, n - 1);
        }
        if(b.charAt(m - 1) == c.charAt(n - 1)){
            return isInterleave(a, b, c, l, m - 1, n - 1);
        }
        return false;
    }

    public static void main(String[] args) {
        String a = "x";
        String b = "axy";
        String c = "xa";
        System.out.println(isInterleave(a, b, c, a.length(), b.length(), c.length()));
    }
}

package Strings;

public class InterleavingString {
    public static void main(String[] args) {
        String a = "abc";
        String b = "def";
        String c = "adebfc";

        System.out.println(isInterleave(a, b, c, a.length(), b.length(), c.length()));
    }
    private static boolean isInterleave(String a, String b, String c, int i, int j, int k){
        if(a.length() + b.length() != c.length()) return false;
        if(a.length() == 0 && b.length() == 0 && c.length() == 0) return true;
        boolean b1 = false;
        if(i != a.length() && k != c.length() && a.charAt(i) == c.charAt(k)){
            b1 = isInterleave(a, b, c, i + 1, j, k + 1);
        }
        boolean b2 = false;
        if(j != b.length() && k != c.length() && b.length() > 0 && b.charAt(j) == c.charAt(k)){
            b2 = isInterleave(a, b, c, i, j + 1, k + 1);
        }
        return b1 || b2;
    }

}

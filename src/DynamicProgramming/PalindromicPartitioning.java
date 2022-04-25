package DynamicProgramming;

public class PalindromicPartitioning {
    public static void main(String[] args) {
        String s = "aaabba";
        System.out.println(minCuts(s, 0, s.length() - 1));
    }
    private static boolean isPalidrome(String s){
        StringBuilder sb = new StringBuilder(s);
        String t = sb.reverse().toString();
        return t.equals(s);
    }

    private static int minCuts(String s, int i, int j){
        if(isPalidrome(s)) return 0;
        int min = Integer.MAX_VALUE;
        for(int k = i + 1;k<j;k++){
            min = Integer.min(min, 1 + minCuts(s, i, k) + minCuts(s, k, j));
        }
        return min;
    }
}

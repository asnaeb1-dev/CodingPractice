package Backtracking;

public class LargestNumberAfterKSwaps {
    static int max;

    public static void main(String[] args) {
        String s = "1234567";
        findMaximumNum(s, s.length());
    }
    public static String findMaximumNum(String str, int k){
        //code here.
        findMax(str, k, str.length());
        System.out.println(max);
        return String.valueOf(max);
    }

    public static String swap(String s, int i, int j){
        char[] list = s.toCharArray();
        char t = list[i];
        list[i] = list[j];
        list[j] = t;
        return String.valueOf(list);
    }

    private static void findMax(String s, int k, int n){
        max = Integer.max(Integer.parseInt(s), max);
        if(k == 0) return;
        for(int i = 0;i<n - 1;i++){
            for(int j = i + 1;j<n;j++){
                if(s.charAt(i) < s.charAt(j)){
                    String swapped = swap(s, i, j);
                    findMax(swapped, k - 1, n);
                }
            }
        }
    }
}

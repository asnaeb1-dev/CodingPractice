package DynamicProgramming;

import java.util.HashSet;
import java.util.Set;

public class LongestSub {
    public static void main(String[] args) {
        int[] a = {10, 9, 4, 5, 4, 8, 6};
        System.out.println(longestSubsequence(a.length, a));
    }
    static int longestSubsequence(int N, int A[]){
        // code here
        Set<Integer> set = new HashSet<>();
        for(int i : A){
            set.add(i);
        }

        int maxSub = Integer.MIN_VALUE;
        for(int i = 0;i<N;i++){
            if(!set.contains(A[i] - 1)){
                int t = A[i];
                int sub = 0;
                while(set.contains(t)){
                    sub++;
                    t++;
                }
                maxSub = Integer.max(maxSub, sub);
            }
        }
        return maxSub;
    }
}

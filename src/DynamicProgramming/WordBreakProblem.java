package DynamicProgramming;

import java.util.Set;

public class WordBreakProblem {
    public static void main(String[] args) {

    }
    private static int countWords(Set<String> dictionary, String s){
        int[] dp = new int[s.length()];
        for(int i = 1;i< dp.length;i++){
            for(int j = 0;j<i;j++){
                if(s.contains(s.substring(j, i))){
                    if(j == 0){
                        dp[i]++;
                    }else
                    dp[i] +=dp[j];
                }
            }
        }
        return dp[s.length() - 1];
    }
}

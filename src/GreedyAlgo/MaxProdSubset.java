package GreedyAlgo;

public class MaxProdSubset {
    public static void main(String[] args) {
        int[] a = {-2, -4, 4, 3};
        System.out.println(maxProdSubset(a, a.length));
    }
    private static int maxProdSubset(int[] a, int n){
        int prod = 1;
        int maxNeg = Integer.MIN_VALUE;
        int negativeCount = 0;
        for(int i : a){
            if(i < 0){
                negativeCount++;
                maxNeg = Integer.max(maxNeg, i);
            }
        }
        if(negativeCount % 2 == 0){
            for(int i : a){
                prod*=i;
            }
        }else{
            boolean found = false;
            for(int i : a){
                if(i == maxNeg && !found){
                    found = true;
                    continue;
                }else {
                    prod*=i;
                }
            }
        }
        return prod;
    }
}

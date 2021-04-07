package StackDS;

public class StockSpanProblem {
    public static void main(String[] args) {
        int[] a = {13, 15, 12, 14, 16, 8, 6, 4, 10, 30};
        int[] r = stockSpan(a, a.length);
        for(int i : r){
            System.out.print(i +" ");
        }
    }
    private static int[] stockSpan(int[] a, int n){
        int[] r = new int[n];
        for(int i = n - 1;i>=0;i--){
           r[i] = 0;
            for(int j = i; j>=0;j--){
                if(a[j] <= a[i]){
                    r[i]++;
                }else{
                    break;
                }
            }
        }
        return r;
    }
}

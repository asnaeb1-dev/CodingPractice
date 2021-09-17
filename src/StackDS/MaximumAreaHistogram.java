package StackDS;

public class MaximumAreaHistogram {
    public static void main(String[] args) {
        int[] a = {6,2,5,4,5,1,6};
        System.out.println(maxArea(a, a.length));
    }

    //time - O(n^2)
    //space - O(1)
    private static int maxArea(int[] a, int n){
        //6 2 5 4 1 5 6
        int max = 0;
        for(int i = 0;i<n;i++){
            int cov = 1;
            if(i != n - 1){
                for(int j = i + 1;j<n;j++){
                    if(a[j] >= a[i]){
                        cov++;
                    }else{
                        break;
                    }
                }
            }
            if(i != 0){
                for(int j = i - 1;j>=0;j--){
                    if(a[j] >= a[i]){
                        cov++;
                    }else{
                        break;
                    }
                }
            }
            if(cov * a[i] > max){
                max = cov * a[i];
            }
        }
        return max;
    }
}

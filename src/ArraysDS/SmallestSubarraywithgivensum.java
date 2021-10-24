package ArraysDS;

public class SmallestSubarraywithgivensum {
    public static void main(String[] args) {
        int[] a = {1, 4, 45, 6, 0, 19};
        System.out.println(smallestSubWithSum(a, a.length, 51));
    }
    public static int smallestSubWithSum(int a[], int n, int target) {
        // Your code goes here
        int i = -1, j = -1, min = Integer.MAX_VALUE, sum = 0;
        while(i <= j && j < n - 1){
            while(j < n - 1){
                j++;
                sum+=a[j];
                if(sum > target){
                    break;
                }
            }
            while(i <= j){
                if(j - i < min){
                    min = j - i;
                }
                i++;
                sum-=a[i];
                if(sum <= target){
                    break;
                }
            }
        }
        return min;
    }
}

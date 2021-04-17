package ArraysDS;

/**
 * A peak element in an array is the one that is not smaller than its neighbours.
 * Given an array of size N, find the index of any one of its peak elements.
 *
 * Example 1:
 *
 * Input:
 * N = 3
 * arr[] = {1,2,3}
 * Output: 2
 * Explanation: index 2 is 3.
 * It is the peak element as it is
 * greater than its neighbour 2.
 *
 * Example 2:
 *
 * Input:
 * N = 2
 * arr[] = {3,4}
 * Output: 1
 * Explanation: 4 (at index 1) is the
 * peak element as it is greater than
 * its only neighbour element 3.
 */

public class PeakElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(peakElement(arr, arr.length));
    }
    public static int peakElement(int[] a,int n){
            //add code here.
            for(int i = 0;i<a.length;i++){
                if(i == 0){
                    if(a[i + 1] < a[i]){
                        return a[i];
                    }
                }else if(i == a.length - 1){
                    if(a[i - 1] < a[i]){
                        return a[i];
                    }
                }else{
                    if(a[i] > a[i + 1] && a[i] > a[i - 1]){
                        return a[i];
                    }
                }
            }
            return -1;
        }

}

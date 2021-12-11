package ArraysDS;

import java.util.Arrays;

public class ThreeWayPartition {
    public static void main(String[] args) {
        int[] a = {3, 2, 1, 3, 4};
        threeWayPartition(a, 2, 3);
        System.out.println(Arrays.toString(a));
    }
    public static void threeWayPartition(int arr[], int a, int b){
        // code here
        int low = 0, mid = 0, high = arr.length - 1;
        while(mid <= high){
            if(arr[mid] < a){
                int t = arr[low];
                arr[low] = arr[mid];
                arr[mid] = t;
                low++;
                mid++;
            }else if(arr[mid] > b){
                int t = arr[mid];
                arr[mid] = arr[high];
                arr[high] = t;
                high--;
                mid++;
            }else{
                mid++;
            }
        }
    }
}

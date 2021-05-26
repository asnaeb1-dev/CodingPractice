package Searching;
//*IMPORTANT
/*
    A peak element in an array is the one that is not smaller than its neighbours.
    Given an array arr[] of size N, find the index of any one of its peak elements.
    Note: The generated output will always be 1 if the index that you return is correct. Otherwise output will be 0.

    Example 1:
    Input:
    N = 3
    arr[] = {1,2,3}
    Output: 2
    Explanation: index 2 is 3.
    It is the peak element as it is
    greater than its neighbour 2.
    Example 2:

    Input:
    N = 2
    arr[] = {3,4}
    Output: 1
    Explanation: 4 (at index 1) is the
    peak element as it is greater than
    its only neighbour element 3.
 */
public class PeakElement {
    public static void main(String[] args) {
        int[] a = {5, 20, 40, 30, 20, 50, 60};
        //System.out.println(findPeak(a));
        System.out.println(findPeakEff(a, a.length));
    }
    //O(n) time complexity
    private static int findPeak(int[] a){
        if(a.length == 1){
            return a[0];
        }
        if(a[0] > a[1]){
            return a[0];
        }
        if(a[a.length - 1] > a[a.length - 2]){
            return a[a.length - 1];
        }
        for(int i = 1;i<a.length - 1;i++){
            if(a[i] > a[i + 1] && a[i] > a[i - 1]){
                return a[i];
            }
        }
        return -1;
    }
    //O(log n) time complexity
    private static int findPeakEff(int[] arr, int n){
        if(n == 1){
            return 0;
        }
        if(n == 2){
            if(arr[0] > arr[1]){
                return 0;
            }else{
                return 1;
            }
        }
        int l = 0, r = n - 1;
        while(l <= r){
            int mid = (l + r) / 2;
            if(mid == 0 || mid == n - 1){
                return mid;
            }
            if(arr[mid] >= arr[mid + 1] && arr[mid] >= arr[mid - 1]){
                return mid;
            }else if(arr[mid + 1] >= arr[mid]){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return -1;
    }
}

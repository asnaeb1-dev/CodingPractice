package Sorting;

import java.util.Arrays;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        int[] a = {6, 4, 9, 7, 8};
        System.out.println(findNumberOfTriangles(a, a.length));
    }
    static int findNumberOfTriangles(int arr[], int n){
        // code here
        Arrays.sort(arr);
        int c = 0;
        for(int i = 0;i<n - 1;i++){
            int l = i + 1;
            int r = n - 1;
            while(l < r){
                int v =(int) (Math.pow(arr[i], 2) + Math.pow(arr[l], 2) - Math.pow(arr[r], 2));
                if(v == 0){
                    c++;
                }else if(v < 0){
                    r--;
                }else{
                    l++;
                }
            }
        }
        return c;
    }
}

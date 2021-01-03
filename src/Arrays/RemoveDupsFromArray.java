package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDupsFromArray {
    public static void main(String[] args) {
        int[] a = {1, 1, 2, 2, 4, 4, 4, 4, 5, 5, 5, 6};
        int res = rD(a, a.length);
        System.out.print(res);
    }

    public static ArrayList<Integer> removeDups(int[]arr){
        int n = arr.length;
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 1;i<n;i++){
            if(arr[i - 1] != arr[i]){
                al.add(arr[i]);
            }
        }
        return al;
    }
    // time - O(n)
    //space - O(1)
    public static int rD(int[]arr, int n ){
        if (n == 0 || n == 1)
            return n;
        
        int j = 0;
        for (int i = 0; i < n-1; i++)
            if (arr[i] != arr[i+1])
                arr[j++] = arr[i];

        arr[j++] = arr[n-1];
        return j;
    }
}

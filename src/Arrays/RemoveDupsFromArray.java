package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDupsFromArray {
    public static void main(String[] args) {
        int[] a = {1, 1, 2, 2, 4, 4, 4, 4, 5, 5, 5, 6};
        int[] res = rD(a);
        System.out.print(Arrays.toString(res));
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
    public static int[] rD(int[]arr){
        int j = 0;
        for(int i = 0;i<arr.length - 1;i++){
            if(arr[i] != arr[i+ 1]){
                arr[j] = arr[i];
                j++;
            }
            arr[j] = arr[arr.length - 1];
        }
        return arr;
    }
}

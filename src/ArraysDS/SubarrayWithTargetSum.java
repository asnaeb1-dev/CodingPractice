package ArraysDS;

import java.util.ArrayList;
//Question --->
// Given integer array, find subarray that adds up to a given sum
// array = {2, 6, 0, 9, 7, 3, 1, 4, 1, 10}, target = 15
public class SubarrayWithTargetSum {
    public static void main(String[] args) {
        int[] a = {0, 5, -7, 1, -4, 7, 6, 1, 4, 1, 10};
        System.out.println(targetSubarray(a, a.length, 15).toString());
    }
    private static ArrayList<Integer> targetSubarray(int[] a, int n, int target){
        int i = -1, j = -1;
        int sum = 0;
        int start = -1, end = -1;
        while(i <= j && j < n - 1){
            //keep acquiring value until the value of sum is grater than or equals to the target provided
            // as soon as target is achieved or over achieved, break
            while(j < n - 1){
                j++;
                sum+=a[j];
                if(sum >= target){
                    break;
                }
            }
            //now inside this loop, check if the sum is equals
            //if not keep substracting from the start and checking if the value is reached
            while(i <= j){
                if(sum == target){
                    start = i + 1;
                    end = j;
                    break;
                }
                i++;
                sum-=a[i];
            }
            if(start != -1 && end != -1){
                break;
            }
        }
        ArrayList<Integer> al = new ArrayList<>();
        for(int x = start;x<=end;x++){
            al.add(a[x]);
        }
        return al;
    }
}

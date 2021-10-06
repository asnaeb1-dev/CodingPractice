package ArraysDS;

import java.util.Arrays;

public class TwoSum {
    private static void twoSum(int[] a, int n, int t){
        Arrays.sort(a);
        int l = 0, h = n - 1;
        while(l < h){
            if(a[l] + a[h] == t){
                System.out.println(a[l] +", " + a[h] );
                l++;
                h--;
            }else if(a[l] + a[h] > t){
                h--;
            }else{
                l++;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {3, 2, 4};
        twoSum(a, a.length, 6);
    }
}

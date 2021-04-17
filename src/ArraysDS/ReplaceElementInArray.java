package ArraysDS;

import java.util.Arrays;

public class ReplaceElementInArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 5, 6};
        remove(a, a.length, 2);
        System.out.print(Arrays.toString(a));
    }

    public static void remove(int[]a, int n, int d){
        for(int j = 0;j<d;j++){
            int temp = a[0];
            for(int i = 0;i<n - 1;i++){
                a[i] = a[i + 1];
            }
            a[n - 1] = temp;
        }
    }
}

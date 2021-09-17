package ArraysDS;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class ProductArrayPUzzle {
    public static void main(String[] args) {
        int[] ar = {0, 8, 6, 2 ,4, 7 ,9 ,3, 9 ,2, 8 ,3, 0 ,1, 7, 8 ,9 ,1, 5, 4, 9, 2 ,5 ,7 ,4, 9, 9, 4};
        long[] a = puzzle(ar, ar.length);
        System.out.println(Arrays.toString(a));


        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        map.put(1, 3);
        map.put(2, 4);

        //map.
    }
    private static long[] puzzle(int[] arr, int n){
        long product = 1;
        int hasZero = 0;
        long[] p = new long[n];
        for(int i : arr){
            if(i != 0){
                product*=i;
            }else{
                hasZero++;
            }
        }
        for(int i = 0;i<n;i++){
           if(hasZero == 1){
               if(arr[i] == 0){
                   p[i] = product;
               }else{
                   p[i] = 0;
               }
           }else if(hasZero > 1){
               p[i] = 0;
           }else{
               p[i] = product / arr[i];
           }
        }
        return p;
    }
}

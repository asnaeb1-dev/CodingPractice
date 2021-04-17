package ArraysDS;
import java.util.*;

public class RotateArray {
    //TECHNIQUE - 1: Using temp array
    private static void rotate(int[] a, int n, int d){
        int[] ret = new int[n];
        for(int i = 0;i<n;i++){
            if(i + d < n){
                ret[i + d] = a[i];
            }else{
                ret[i + d - n] = a[i];
            }
        }
        for(int i = 0;i<n;i++){
            System.out.print(ret[i] + " ");
        }
    }

    //TECHNIQUE - 2: JUGGLING ALGORITHM
    private static void juggle(int[]a, int n, int d){
        for(int i = 0;i<gcd(n, d); i++){
            /**
             * 2 conditions here:
             * 1) when the index < n; i - d
             * 2) when the index >n; i - d + n
             */
            int t = a[i];
            int j = i;
            while(true){
                if(j + d >= n){
                    a[j] = a[j + d - n];
                }else if(j + d == i){
                    break;
                }else{
                    a[j] = a[j + d];
                }
                j = j + d;
            }
            a[j] = t;
        }
    }

    private static  int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a % b);
    }

    //TECHNIQUE - 3: Move array to any direction, but one by one; O(n * d)
    private static void moveOneByOne(int[]a, int d, int n){
        for(int j = 0;j<d;j++){
            int temp = a[0];
            for(int i = 0;i<n - 1;i++){
                a[i] = a[i + 1];
            }
            a[n - 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int n = 6, d = 2;
        juggle(arr, n, d);
        System.out.print(Arrays.toString(arr));
    }
}

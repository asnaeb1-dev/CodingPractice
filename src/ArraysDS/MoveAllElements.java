package ArraysDS;

import java.util.Arrays;

/**
 * Question - Move all negative elements to the left hand side
 */
public class MoveAllElements {
    private static void move(int[] a, int n){
        int l = 0, h = n - 1;
        while(l < h){
            if(a[l] < 0 && a[h] > 0){
                l++;
                h--;
            }else if(a[l] > 0){
                if(a[h] < 0){
                    int t = a[l];
                    a[l] = a[h];
                    a[h] = t;
                    l++;
                }
                h--;
            }else {
                l++;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {-1, 2, -4,  5, 6, 7, -19, -2, 3};
        move(a, a.length);
        System.out.println(Arrays.toString(a));
    }
}

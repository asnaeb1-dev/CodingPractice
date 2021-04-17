package ArraysDS;

import java.util.Arrays;

public class CountMinimumSwaps {
    public static void main(String[] args) {
        int[] arr = {5, 4, 2, 3, 1};
        countMinSwaps(arr);

    }
    private static int countMinSwaps(int[] a){
        int[] temp = Arrays.copyOfRange(a, 0, a.length);
        System.out.println(Arrays.toString(temp));
        return -1;
    }

}

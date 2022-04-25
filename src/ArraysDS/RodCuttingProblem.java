package ArraysDS;

import java.util.ArrayList;
import java.util.Arrays;

public class RodCuttingProblem {
    public static ArrayList<Integer> RopeCutting (int a[], int n) {
        // Complete the Function
        Arrays.sort(a);
        int currMin = a[0];
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 1;i<n;i++){
            if(a[i] != currMin){
                res.add(n - i);
                currMin = a[i];
            }
        }
        return res;
    }
}

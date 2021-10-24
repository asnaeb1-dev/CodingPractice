package ArraysDS;

import java.util.ArrayList;
import java.util.HashMap;

/**Question -->
 * Find the count of distinct elements in every subarray of size `k`
 *
 * https://www.techiedelight.com/count-distinct-elements-every-sub-array-size-k-array/
 */
public class CountDistinctElements {
    public static void main(String[] args) {
        int[] a = {1, 1, 2, 1, 3};
        System.out.println(countDistinct(a, a.length, 3));
    }
    private static ArrayList<Integer> countDistinct(int[] a, int n, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0;i<k;i++){
            if(map.containsKey(a[i])){
                map.put(a[i], map.get(a[i]) + 1);
            }else{
                map.put(a[i], 1);
            }
        }

        ArrayList<Integer> al = new ArrayList<>();
        al.add(map.size());
        int j = 0;
        for(int i = k;i < n;i++){
            map.put(a[j], map.get(a[j]) - 1);
            if(map.containsKey(a[i])){
                al.add(map.size());
                map.put(a[i], map.get(a[i]) + 1);
            }else{
                map.put(a[i], 1);
                al.add(map.size());
            }
        }
        return al;
    }
}

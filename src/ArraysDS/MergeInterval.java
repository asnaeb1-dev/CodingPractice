package ArraysDS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**Question
 * Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals,
 * and return an array of the non-overlapping intervals that cover all the intervals in the input.
 *
 *
 * Example 1:
 *
 * Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
 * Output: [[1,6],[8,10],[15,18]]
 * Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
 * Example 2:
 *
 * Input: intervals = [[1,4],[4,5]]
 * Output: [[1,5]]
 * Explanation: Intervals [1,4] and [4,5] are considered overlapping.
 */
public class MergeInterval {
    public static void main(String[] args) {
        int[][] a={{1, 3}, {3, 4}, {15, 18}, {8, 10}}; //{{1, 4}, {0, 4}};
        int[][] al = merge(a);
        for(int[] i : al){
            System.out.println(i[0] + ", "+ i[1]);
        }
    }
    private static int[][] merge(int[][] a){
        Arrays.sort(a, Comparator.comparingInt(o -> o[0]));

        ArrayList<int[]> al = new ArrayList<>();
        al.add(a[0]);
        int k = 0;
        for(int i = 1;i<a.length;i++){
            if(al.get(k)[1] >= a[i][0]){
                if(al.get(k)[1] >= a[i][1]){
                    int[] t = {al.get(k)[0], al.get(k)[1]};
                    al.remove(al.get(k));
                    al.add(t);
                }else{
                    int[] t = {al.get(k)[0], a[i][1]};
                    al.remove(al.get(k));
                    al.add(t);
                }
            }else{
                al.add(a[i]);
                k++;
            }
        }

        int[][] r = new int[al.size()][2];
        int x = 0;
        for(int[] i : al){
            r[x][0] = i[0];
            r[x][1] = i[1];
            x++;
        }
        return r;
    }
}

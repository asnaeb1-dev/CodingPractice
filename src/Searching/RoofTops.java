package Searching;

/**Question ->
 * You are given heights of consecutive buildings.
 * You can move from the roof of a building to the roof of next adjacent building.
 * You need to find the maximum number of consecutive steps you can put forward such that you gain an increase in altitude with each step.
 *
 * Example 1:
 *
 * Input:
 * N = 5
 * A[] = {1,2,2,3,2}
 * Output: 1
 * Explanation: 1, 2 or 2, 3 are the only consecutive
 * buildings with increasing heights.
 * Example 2:
 *
 * Input:
 * N = 4
 * A[] = {1,2,3,4}
 * Output: 3
 * Explanation: 1 to 2 to 3 to 4 is the jump of
 * length 3 to have maximum number of
 * buildings with increasing heights.
 */
public class RoofTops {
    public static void main(String[] args) {
        int[] a = {4, 5, 1, 5, 6};
        System.out.println(rooftop(a, a.length));
    }
    private static int rooftop(int[] A, int N){
        int max = 0;
        int c = 0;
        for(int i = 1;i<N;i++){
            if(A[i] > A[i - 1]){
                c++;
            }else{
                max = Math.max(max, c);
                c = 0;
            }
        }
        max = Math.max(max, c);
        return max;
    }
}

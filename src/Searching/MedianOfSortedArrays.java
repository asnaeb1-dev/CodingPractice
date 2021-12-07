package Searching;

/**EXPLANATION
 * https://practice.geeksforgeeks.org/tracks/DSASP-Searching/?batchId=154&tab=1
 */
public class MedianOfSortedArrays {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        int[] b = {5, 15, 25, 30, 35, 55, 65, 75, 85};
        System.out.println(findMedian(a, a.length, b, b.length));
    }
    public static int findMedian(int a[], int n, int b[], int m){
        //Your code here
        int l = 0;
        int h = n;

        while(l <= h){
            //get the value of i1
            int i1 = (l + h) / 2;
            //get the value of i2 using formula
            //i2 = (n1 + n2 + 1)/2 - i1
            int i2 = ((n + m + 1)/ 2) - i1;
            //min1 = minimum value on the RHS of the a1
            //min2 = minimum value on the RHS of the a2
            //max1 = maximum value on the LHS of the a1
            //max2 = maximum value on the LHS of the a2
            int min1 = (i1 == n) ? Integer.MAX_VALUE :  a[i1];
            int max1 = (i1 == 0 )? Integer.MIN_VALUE : a[i1 - 1];
            int min2 = (i2 == m) ? Integer.MAX_VALUE : b[i2];
            int max2 = (i2 == 0) ?  Integer.MIN_VALUE : b[i2 - 1];

            //check if the set a1 has all of its elements smaller than set a2
            if(max1 <= min2 && max2 <= min1){
                if((n + m) % 2 == 0){
                    //if even
                    return (Math.min(min1, min2) + Math.max(max1, max2)) / 2;
                }else{
                    //if odd
                    return Math.max(max1, max2);
                }
            }else if(max1 > min2){
                h = i1 - 1;
            }else{
                l = i1 + 1;
            }
        }
        return 0;
    }
}

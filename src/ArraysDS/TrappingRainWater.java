package ArraysDS;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] a = {3, 0, 1, 2, 5};
        //System.out.println(trapWater(a, a.length));
        System.out.println(trapWaterEfficient(a, a.length));
    }
    //Time - O(n^2)
    //Space - O(1)
    private static int trapWater(int[] a, int n){
        int lMax = a[0], rMax = a[n - 1];
        int res = 0;
        for(int i = 1;i<n - 1;i++){
            for(int j = i - 1;j>=0;j--){
                lMax = Integer.max(lMax, a[j]);
            }

            for(int j = i + 1;j<n;j++){
                rMax = Integer.max(rMax, a[j]);
            }
            res+= Integer.min(lMax, rMax) - a[i];
        }
        return  res;
    }

    private static int trapWaterEfficient(int[] a, int n){
        /*As shown in the naive solution, we are computing the left maximum height and right maximu height for every index,
        * herein the efficient approach, we try to precompute the lmax and rmax */
        //we initialize 2 arrays lMax and rMax
        int[] lMax = new int[n];
        int[] rMax = new int[n];

        lMax[0] = a[0];
        //we compare the maximum from LHS for each index and save it to the lMax
        for(int i = 1;i<n;i++){
            lMax[i] = Integer.max(lMax[i - 1], a[i]);
        }

        //similarly we compute rMax
        rMax[n - 1] = a[n - 1];
        for(int i = n -2;i>=0;i--){
            rMax[i] = Integer.max(rMax[i + 1], a[i]);
        }

        int result = 0;
        for(int i = 1;i<n-1;i++){
            result+= Integer.min(lMax[i], rMax[i]) - a[i];
        }
        return result;
    }

}

package ArraysDS;

public class SmallestSubarraywithgivensum {
    public static void main(String[] args) {
        int[] a = {1, 4, 45, 6, 0, 19};
        System.out.println(smallestSubWithSum(a, a.length, 51));
    }
    public static int smallestSubWithSum(int arr[], int n, int x) {
        // Your code goes here
        int i=0;
        int j=0;
        int sum=0;
        int length=Integer.MAX_VALUE;
        while(i<n && j<n)
        {
            sum=sum+arr[j];
            while(i<n && sum>x)
            {
                length=Math.min(length,j-i+1);
                sum=sum-arr[i];
                i++;
            }
            j++;
        }
        return length;
    }
}

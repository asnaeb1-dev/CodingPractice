package ArraysDS;

public class MinimumOpsToMakeArrayPalindrome {
    public static void main(String[] args) {
        int[] a = {1, 4, 5, 1};
        System.out.println(minimumOperations(a, a.length));
    }
    private static int minimumOperations(int[] a, int n){
        int operations = 0, i = 0, j = n - 1;
        while(i <= j){
            if(a[i] == a[j]){
                i++;
                j--;
            }else if(a[i] < a[j]){
                i++;
                a[i]+=a[i - 1];
                operations++;
            }else{
                j--;
                a[j] +=a[j + 1];
                operations++;
            }
        }
        return operations;
    }
}

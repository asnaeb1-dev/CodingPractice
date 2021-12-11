package ArraysDS;

public class MaximumIndex {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(maximum(a, a.length));
    }
    private static int maximum(int[] a, int n){
        int i = 0;
        return a[++i];
    }
}

package Arrays;

public class ReverseAnArray {
    public static void reverse(int[]a){
        int n = a.length;
        for(int i = 0;i<n/2;i++){
            int temp = a[n - (i + 1)];
            a[n - (i + 1)] = a[i];
            a[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,5, 6};
        reverse(a);
        for(int i = 0;i<5;i++){
            System.out.print(a[i]);
        }
    }
}

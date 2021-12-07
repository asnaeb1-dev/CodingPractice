package Searching;

public class ArrayIndexing {
    public static void main(String[] args) {
        int[] a = {1, 3, 3};
        arrayIndexing(a, a.length);
    }
    private static void arrayIndexing(int[] a, int n){
        for(int i = 0;i<n;i++){
            a[i]--;
        }
        for(int i = 0;i<n;i++){
            a[a[i] % n]+=n;
        }
        for(int i = 0;i<n;i++){
            a[i]/=n;
            if(a[i] > 1){
                System.out.println("Repeating-"+ (i + 1));
            }
            if(a[i] == 0){
                System.out.println("Missing- "+ (i + 1));
            }
        }
    }
}

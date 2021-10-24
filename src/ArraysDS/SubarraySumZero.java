package ArraysDS;

public class SubarraySumZero {
    public static void main(String[] args) {
        int[] a = {0, 0, 5, 5, 0, 0};
        System.out.println(countSubarray(a, a.length));
    }
    private static int countSubarray(int[] a, int n){
        int i = -1, j = -1, s = 0, c = 0;
        while(i <= j && j < n - 1){
            while(j < n - 1){
                j++;
                System.out.println(j);
                if(a[j] == 0) {
                    c++;
                    System.out.println("here");
                }
                s+=a[j];
                if(s > 0) break;
            }
            while(i <= j){
                if(s == 0 && j - i != 0){
                    System.out.println("heere");
                    c++;
                }else if(s < 0) break;
                i++;
                s-=a[i];
            }
        }
        return c;
    }
}

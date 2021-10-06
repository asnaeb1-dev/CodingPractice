package ArraysDS;
import java.util.ArrayList;
import java.util.Arrays;

public class FindDuplicatesInArray {
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 5, 7};
        //System.out.println(findDuplicates(a, a.length).toString());
        find(a, a.length);
        System.out.println(Arrays.toString(a));
    }
    //Time - O(n)
    //Time - O(n)
    private static ArrayList<Integer> findDuplicates(int[] a, int n){
        ArrayList<Integer> al = new ArrayList<>();
        int[] count = new int[n];
        for(int i = 0;i<n;i++){
            count[a[i]]++;
        }
        for(int i = 0;i<n;i++){
            if(count[i] > 1){
                al.add(i);
            }
        }
        return al;
    }

    private static void find(int[] a, int n){
//        for(int i =0;i<n;i++){
//            a[i]--;
//        }
        for(int i = 0;i<n;i++){
            a[a[i] % n] = a[a[i] % n] + n;
        }
        for(int i = 0;i<n;i++){
            a[i] = a[i] / n;
        }
    }

}

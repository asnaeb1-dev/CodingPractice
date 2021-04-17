package ArraysDS;
import java.util.ArrayList;

public class FindDuplicatesInArray {
    public static void main(String[] args) {
        int[] a = {2, 3, 1, 2, 3};
        System.out.println(findDuplicates(a, a.length).toString());
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

//    private static ArrayList<Integer> findDups(int[] a, int n){
//
//    }
}

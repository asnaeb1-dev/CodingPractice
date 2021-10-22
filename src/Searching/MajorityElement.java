package Searching;

/**Question --->
 * Given an array A of N elements. Find the majority element in the array.
 * majority element in an array A of size N is an element that appears more than N/2 times in the array.
 *
 *
 * Example 1:
 *
 * Input:
 * N = 3
 * A[] = {1,2,3}
 * Output:
 * -1
 * Explanation:
 * Since, each element in
 * {1,2,3} appears only once so there
 * is no majority element.
 * Example 2:
 *
 * Input:
 * N = 5
 * A[] = {3,1,3,3,2}
 * Output:
 * 3
 * Explanation:
 * Since, 3 is present more
 * than N/2 times, so it is
 * the majority element.
 */
//https://www.youtube.com/watch?v=n5QY3x_GNDg
public class MajorityElement {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        System.out.println(majorityElement(a, a.length));
    }
    private static int majorityElement(int[] a, int size){
        int maj = a[0];
        int c = 1;
        for(int i = 1;i<size;i++){
            if(a[i] == maj){
                c++;
            }else{
                c--;
                if(c == 0){
                    maj = a[i];
                    c = 1;
                }
            }
        }
        int count = 0;
        for(int i : a){
            if(maj == i){
                count++;
            }
        }
        if(count > (size/2)){
            return maj;
        }
        return -1;
    }
}

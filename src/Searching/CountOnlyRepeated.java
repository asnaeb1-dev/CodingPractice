package Searching;

/**Question -->
 * Given an array arr[] of N positive integers,
 * where elements are consecutive (sorted).
 * Also, there is a single element which is repeating X (any variable) number of times.
 * Now, the task is to find the element which is repeated and number of times it is repeated.
 * Note: If there's no repeating element, Return {-1,-1}.
 *
 *
 * Example 1:
 *
 * Input:
 * N = 5
 * arr[] = {1,2,3,3,4}
 * Output: 3 2
 * Explanation: In the given array, 3 is
 * occuring two times.
 * Example 2:
 *
 * Input:
 * N = 5
 * arr[] = {2,3,4,5,5}
 * Output: 5 2
 * Explanation: In the given array, 5 is
 * occuring two times.
 * Example 3:
 *
 * Input:
 * N = 3
 * arr[] = {1,2,3}
 * Output: -1 -1
 * Explanation: In the given array, there's no
 * repeating element, and thus the given Output.
 */

public class CountOnlyRepeated {
    static class Point{
        int number;
        int count;

        public Point(int number, int count) {
            this.number = number;
            this.count = count;
        }
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        System.out.println(findRepeating(a, a.length));
    }
    public static Point findRepeating(int[] arr,int n){
        if(arr.length == 1){
            return new Point(-1, -1);
        }
        int l = 0;
        int h = n - 1;

        while(l <= h){
            int mid = l + (h - l)/2;
            if(mid == 0 && arr[mid + 1] - arr[mid] == 0){
                int c = (n - 1) - (arr[n - 1] - arr[0]) + 1;
                return new Point(arr[mid], c);
            }else if(mid == n - 1 && arr[mid] - arr[mid - 1] == 0){
                int c = (n - 1) - (arr[n - 1] - arr[0]) + 1;
                return new Point(arr[mid], c);
            }else if(arr[mid + 1] - arr[mid] == 0 || arr[mid] - arr[mid - 1] == 0){
                int c = (n - 1) - (arr[n - 1] - arr[0]) + 1;
                return new Point(arr[mid], c);
            }else if(h - mid == arr[h] - arr[mid] && mid - l == arr[mid] - arr[l]){
                break;
            }else if(h - mid != arr[h] - arr[mid]){
                l = mid + 1;
            }else if(mid - l != arr[mid] - arr[l]){
                h = mid - 1;
            }
        }
        return new Point(-1, -1);
    }
}

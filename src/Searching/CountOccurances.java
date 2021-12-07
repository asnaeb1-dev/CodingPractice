package Searching;

/**
 * Count number of elements that are present in a sorted array
 */
public class CountOccurances {
    public static void main(String[] args) {
        int[] a = {1, 10, 10, 10, 20, 30, 40};
        System.out.println(countOccurances(a, 10));
    }
    private static int countOccurances(int[] a, int x){
        int first = new FirstOccurance().firstOccuranceIter(a, x);
        int last = new LastOccurance().lastOccurance(a, x);

        return last - first + 1;
    }
}

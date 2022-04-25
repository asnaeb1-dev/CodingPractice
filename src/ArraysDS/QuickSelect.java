package ArraysDS;

public class QuickSelect {
    public static void main(String[] args) {
        int[] a = {7, 10, 4, 3 ,20, 15};
        int k = 3;
        System.out.println(kthSmallest(a, 0, a.length - 1, k));
    }

    public static int kthSmallest(int[] arr, int l, int r, int k) {
        //Your code here

        int pa = partition(arr, l, r);
        if(pa == k - 1) return arr[pa];
        if(pa < k - 1){
            return kthSmallest(arr, pa + 1, r, k);
        }
        return kthSmallest(arr, l, pa - 1, k);
    }

    private static int partition(int[] a, int low, int high){
        int i = low - 1;
        int pivot = high;

        for(int j = low;j<high;j++){
            if(a[j] < a[pivot]){
                i++;
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }

        int t = a[i + 1];
        a[i + 1] = a[high];
        a[high] = t;

        return i + 1;
    }
}

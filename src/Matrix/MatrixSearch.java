package Matrix;

public class MatrixSearch {
    public static void main(String[] args) {
        int[][] a = {{18, 21, 27, 38, 55, 67}};
        System.out.println(search(a, 1, 6, 55));
    }
    private static boolean search(int[][] a, int n, int m, int search){
        for(int i = 0;i<n;i++){
            int l = 0;
            int r = m - 1;
            while(l <= r){
                int mid = l + (r - l)/2;
                if(search < a[i][mid]){
                    r = mid - 1;
                }else if(search > a[i][mid]){
                    l = mid + 1;
                }else{
                    return true;
                }
            }
        }
        return false;
    }
}

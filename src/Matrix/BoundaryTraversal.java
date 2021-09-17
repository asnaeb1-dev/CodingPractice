package Matrix;

public class BoundaryTraversal {
    /**
     * 1    2   3   4
     * 5    6   7   8
     * 9    10  11  12
     * 13   14  15  16
     * @param args
     */
    public static void main(String[] args) {
        int[][] a = {{12, 11, 10, 9},
                        {8, 7, 6, 5},
                        {4, 3, 2, 1}};
        System.out.println(boundaryTraversal(a, 3, 4));
    }
    private static String boundaryTraversal(int[][] a, int n, int m){
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(i == 0){
                    sb.append(a[i][j]).append(" ");
                }
                else if(j == m - 1){
                    sb.append(a[i][j]).append(" ");
                }
            }
        }

        for(int i = n - 1;i>=1;i--){
            for(int j = m - 2;j>=0;j--){
                if(i == n - 1){
                    sb.append(a[i][j]).append(" ");
                }else if(j == 0){
                    sb.append(a[i][j]).append(" ");
                }
            }
        }
        return sb.toString();
    }
}

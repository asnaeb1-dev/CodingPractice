package Backtracking;

public class CountAllPossiblePaths {
    public static void main(String[] args) {
        int[][] a = {
                {1, 0},
                {1, 0}
        };
        System.out.println(ratInMaze(a, 0, 0, a.length));
    }
    private static int ratInMaze(int[][] mat, int i, int j, int n){
        if(i == n - 1 && j == n - 1){
            if(mat[i][j] == 1){
                return 1;
            }
        }
        if(i < n && j<n){
            if(mat[i][j] == 0) {
                return 0;
            }
            return ratInMaze(mat, i + 1, j, n) + ratInMaze(mat, i, j + 1, n);
        }
        return 0;
    }
}

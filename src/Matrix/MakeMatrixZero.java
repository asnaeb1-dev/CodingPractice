package Matrix;

import java.util.Arrays;

public class MakeMatrixZero {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}

        };
        convert(mat, mat.length, mat[0].length);
        for(int[] i : mat)
            System.out.println(Arrays.toString(i));
    }
    private static void convert(int[][] mat, int n, int m){

        for(int i = 1;i<n;i++){
            for(int j = 1;j<m;j++){
                if(mat[i][j] == 1){
                    if(mat[i][0] == 0){
                        mat[i][j] = 0;
                    }else if(mat[0][j] == 0){
                        mat[i][j] = 0;
                    }
                }else{
                    mat[0][j] = 0;
                    mat[i][0] = 0;
                }
            }
        }
        if(mat[0][0] == 1 && (mat[0][1] == 0 || mat[1][0] == 0)){
            mat[0][0] = 1;
        }
    }
}

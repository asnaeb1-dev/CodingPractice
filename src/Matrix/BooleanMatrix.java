package Matrix;

import java.util.Arrays;

public class BooleanMatrix {
    public static void main(String[] args) {
        int[][] a = {{1, 0, 0}, {1, 0, 0}, {1, 0, 0}, {0, 0, 0}};
        bool(a);
    }
    private static void bool(int[][] a){
        int[] row = new int[a.length];
        int[] col = new int[a[0].length];

        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<a[i].length;j++){
                if(a[i][j] == 1){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        for(int i = 0;i<a.length;i++){
            if(row[i] == 1){
                Arrays.fill(a[i], 1);
            }
        }
        for(int i = 0;i<a[0].length;i++){
            if(col[i] == 1){
                for(int j = 0;j<a.length;j++){
                    a[j][i] = 1;
                }
            }
        }
    }
}

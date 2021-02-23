package Matrix;

import java.util.ArrayList;

public class SumOfTriangularMatrix {
    public static void main(String[] args) {
        int[][]a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(triangularMatrix(a, a.length));
    }

    private static ArrayList<Integer> triangularMatrix(int[][] a, int n){
        ArrayList<Integer> al = new ArrayList<>();
        int usum = 0;
        //upper triangular matrix
        for(int i = 0;i<n;i++){
            for(int j = i;j<n;j++){
                usum+=a[i][j];
            }
        }
        al.add(usum);

        int lsum = 0;
        //lower triangular matrix
        for(int i = 0;i<n;i++){
            for(int j = 0;j<i+1;j++){
                lsum+=a[i][j];
            }
        }
        al.add(lsum);
        return al;
    }
}

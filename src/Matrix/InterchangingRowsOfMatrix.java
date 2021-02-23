package Matrix;

public class InterchangingRowsOfMatrix {
    static void interchangeRows(int matrix[][]){
        // code here
        int n = matrix.length, m = matrix[0].length;

        for(int i = 0;i<n / 2;i++){
            for(int j = 0;j<m;j++){
                int temp = matrix[n - i- 1][j];
                matrix[n - i - 1][j] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15,16}};
        interchangeRows(a);
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<a[0].length;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}

package Matrix;

public class InterchangeColums {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        interchangeColumns(a);
        for(int i = 0;i<a.length ;i++){
            for(int j = 0;j<a[i].length;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    private static void interchangeColumns(int[][] matrix){
        for(int i = 0;i<matrix[0].length / 2;i++){
            for(int j = 0;j<matrix.length;j++){
                int temp = matrix[j][i];
                matrix[j][i] = matrix[j][matrix[0].length - 1 - i];
                matrix[j][matrix[0].length - 1 - i] = temp;
            }
        }
    }
}

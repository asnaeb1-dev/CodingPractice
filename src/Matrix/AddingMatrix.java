package Matrix;

public class AddingMatrix {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}};
        int[][] b = {{7, 8, 9}, {9, 10, 11}};
        addMatrix(a, b);
    }
    private static void addMatrix(int[][] a, int [][] b){
        //2 matrices can only be added if they have the same dimensions
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<a[i].length;j++){
                System.out.print(a[i][j] +  b[i][j] +" ");
            }
        }
    }
}

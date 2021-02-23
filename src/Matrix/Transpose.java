package Matrix;

public class Transpose {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        new Transpose().transpose(a);
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<a.length;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void transpose(int[][] a){
        for(int i = 0;i<a.length;i++){
            for(int j = i + 1;j<a.length;j++){
                int t = a[j][i];
                a[j][i] = a[i][j];
                a[i][j] = t;
            }
        }
    }
}

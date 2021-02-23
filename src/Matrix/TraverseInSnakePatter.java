package Matrix;

import java.util.ArrayList;

public class TraverseInSnakePatter {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(snakePattern(a).toString());
    }
    private static ArrayList<Integer> snakePattern(int matrix[][])
    {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0;i<matrix.length;i++){
            if(i % 2 == 0){
                for(int j = 0;j<matrix.length;j++){
                    al.add(matrix[i][j]);
                }
            }else{
                for(int j = matrix.length - 1;j>=0;j--){
                    al.add(matrix[i][j]);
                }
            }
        }
        return al;
    }
}

package Matrix;

import java.util.ArrayList;

public class SpiralTraversal {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        ArrayList<Integer> res = traverse(mat);
        System.out.println(res.toString());
    }
    private static ArrayList<Integer> traverse(int[][] mat){
        int n = mat.length;
        int m = mat[0].length;

        int top = 0, btm = n - 1, left = 0, right = m - 1;
        int dir = 0;
        ArrayList<Integer> res = new ArrayList<>();
        //0 - left to right
        //1 - top to bottom
        //2 - right to left
        //3 - bottom to top
        while(top <= btm && left <= right){
            if(dir == 0){
                for(int j = left;j<=right;j++){
                    res.add(mat[top][j]);
                }
                top++;
                dir = 1;
            }else if(dir == 1){
                for(int i = top;i<=btm;i++){
                    res.add(mat[i][right]);
                }
                right--;
                dir = 2;
            }else if(dir == 2){
                for(int j = right;j>=left;j--){
                    res.add(mat[btm][j]);
                }
                btm--;
                dir = 3;
            }else{
                for(int i = btm;i>=top;i--){
                    res.add(mat[i][left]);
                }
                left++;
                dir = 0;
            }
        }
        return res;
    }
}

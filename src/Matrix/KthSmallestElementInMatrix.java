package Matrix;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElementInMatrix {
    public static void main(String[] args) {
        int[][] a = {{16, 28, 60, 64},
                {22, 41, 63, 91},
                {27, 50, 87, 93},
                {36, 78, 87, 94 }};
        int k = 3;
        System.out.println(kthSmallest(a, a.length, k));
    }
    public static int kthSmallest(int[][]mat,int n,int k){
        //code here.
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(pq.size() != k){
                    pq.add(mat[i][j]);
                }else if(mat[i][j] > pq.peek()){
                    break;
                }else{
                    pq.poll();
                    pq.add(mat[i][j]);
                }
            }
        }
        return pq.poll();
    }
}

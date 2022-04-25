package GraphDS;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MinimumStepsByKnight {

    static class Pair{
        int x;
        int y;
        int dist;

        Pair(int x, int y, int dist){
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }

    public static void main(String[] args) {
        int[] k = { 4, 5};
        int[] t = {1, 1};

        System.out.println(minStepToReachTarget(k, t, 6));
    }

    public static int minStepToReachTarget(int k[], int t[], int n){
        // Code here
        int sx = k[0] - 1, sy = k[1] - 1;
        int tx = t[0] - 1, ty = t[1] - 1;

        int[] dx = {1, 2, -1, -2, -1, -2, 1, 2};
        int[] dy = {2, 1, -2, -1, 2, 1, -2, -1};

        Queue<Pair> q = new LinkedList<>();

        //make a visited matrix
        boolean[][] vis = new boolean[n][n];

        q.add(new Pair(sx, sy, 0));
        vis[sx][sy] = true;

        while(!q.isEmpty()){
            Pair p = q.remove();

            //if current point is the target point then return distance
            if(p.x == tx && p.y == ty) return p.dist;

            //traverse through all the possible paths the knight can take
            for(int i = 0;i<8;i++){
                int x = p.x + dx[i];
                int y = p.y + dy[i];

                if(x >= 0 && x < n && y >= 0 && y < n && !vis[x][y]){
                    q.add(new Pair(x, y, p.dist + 1));
                    vis[x][y] = true;
                }
            }
        }
        return -1;
    }
}

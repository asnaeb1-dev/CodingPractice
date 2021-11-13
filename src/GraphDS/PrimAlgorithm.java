package GraphDS;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimAlgorithm {
    public static void main(String[] args) {
        int[][]  adj = {
                {0, 5, 8, 0},
                {5, 0, 10, 15},
                {8, 10, 0, 20},
                {0, 15, 20, 0}
        };
        System.out.println(mst(adj, adj.length));
    }
    private static int mst(int[][] adj, int V){
        //Step 1 : create a mst set
        ArrayList<Integer> set = new ArrayList<>();
        //Step 2: create a key set
        int[] key = new int[V];
        //Step 3: create a visited array to check if we have visted a certain vertex already
        boolean[] vis = new boolean[V];
        //Step 4: Fill the entire array of key with infinity(Integer.MAX_VALUE)
        Arrays.fill(key, Integer.MAX_VALUE);
        //Step 5: Change the first value of key[0] = 0; so that we start from the 0 vertex
        key[0] = 0;
        //Step 6: Start considering each and every vertex one by one and start making changes accordingly
        for(int c = 0;c<V;c++){
            //Step 7: for every iteration, find the minimum element in the key list and use that
            int u = getMinKey(key, vis);
            //Step 9: Mark the vertex visited and add it to the mst set
            vis[u] = true;
            set.add(u);
            //Step 10: Loop through all the adjacent vertices and update the values in the key set only if the new weight for each adjacent
            // vertex is < the current weight
            for(int v = 0;v<V;v++){
                //check if the accessed value is a 0, or it has been visited
                if(adj[u][v] != 0 && !vis[v] && adj[u][v] < key[v]){
                    key[v] = adj[u][v];
                   // System.out.print(key[v] +" ");
                }
            }
        }
        int w = 0;
        for (int j : key) {
            w += j;
        }
        return w;
    }

    private static int getMinKey(int[] key, boolean[] vis) {
        //Step 8: loop through all the keys and check which one is the absolute minimum and return the index of that value
        //NOTE: NODES WHICH ARE ALREADY VISITED MUST NOT BE TAKEN INTO CONSIDERATION
        int min = Integer.MAX_VALUE, min_idx = -1;
        for(int i = 0;i<key.length;i++){
            //check if the vertex is already visited
            if(!vis[i] && key[i] < min){
                min = key[i];
                min_idx = i;
            }
        }
        //return the minimum index
        return min_idx;
    }
}

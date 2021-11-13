package GraphDS;

import java.util.ArrayList;
import java.util.Arrays;

public class PAlgoAdjList {
    public static void main(String[] args) {
        ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<>();
        ArrayList<Integer> e1 = new ArrayList<>();
        e1.add(1);
        e1.add(2);
        ArrayList<ArrayList<Integer>> con1 = new ArrayList<>();
        con1.add(e1);
        adj.add(con1);
        //spanningTree(1, )
    }
    static int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj)
    {
        // Add your code here
        int[] key = new int[V];
        boolean[] vis = new boolean[V];
        ArrayList<Integer> mSet = new ArrayList<>();
        int res = 0;
        Arrays.fill(key, Integer.MAX_VALUE);
        key[0] = 0;
        for(int c = 0;c < V;c++){
            int u = getMinKey(key, vis);
            vis[u] = true;
            mSet.add(u);
            for(int v = 0;v<V;v++){
                if(adj.get(u).get(v).get(0) != 0 &&!vis[v] && adj.get(u).get(v).get(1) < key[v]){
                    key[v] = adj.get(u).get(v).get(1);
                }
            }
        }

        for(int i : key){
            res+=i;
        }
        return res;
    }

    static int getMinKey(int[] key, boolean[] vis){
        int min = Integer.MAX_VALUE, min_idx = -1;
        for(int i = 0;i<key.length;i++){
            if(!vis[i] && key[i] < min){
                min = key[i];
                min_idx = i;
            }
        }
        return min_idx;
    }
}

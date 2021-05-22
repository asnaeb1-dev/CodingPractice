package GraphDS;

import java.util.ArrayList;

//Q-> Count the connected components in an undirected graph.
public class CountConnectedComponents {
    public static void main(String[] args) {
        int V = 7;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(V);
        for(int i = 0;i<V;i++){
            ArrayList<Integer> temp = new ArrayList<>();
            list.add(temp);
        }
        list.get(0).add(1);
        list.get(1).add(0);
        list.get(2).add(3);
        list.get(2).add(4);
        list.get(3).add(2);
        list.get(3).add(4);
        list.get(4).add(2);
        list.get(4).add(3);
        list.get(5).add(6);
        list.get(6).add(5);

        System.out.println(dfs(list, V, 0));
    }
    private static int dfs(ArrayList<ArrayList<Integer>> adj, int V, int s){
        boolean[] visited = new boolean[V];
        int c = 0;
        for(int i = 0;i<V;i++){
            if(!visited[i]){
                dfsRec(adj, visited, i);
                c++;
            }
        }
        return c;
    }
    private static void dfsRec(ArrayList<ArrayList<Integer>> adj, boolean[] visited, int s){
        visited[s] = true;
        for(int v : adj.get(s)){
            if(!visited[v]){
                dfsRec(adj, visited, v);
            }
        }
    }
}

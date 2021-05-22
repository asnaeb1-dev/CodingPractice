package GraphDS;

import java.util.ArrayList;

public class DepthFirstSearch {
    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(V);
        for(int i = 0;i<V;i++){
            ArrayList<Integer> temp = new ArrayList<>();
            list.add(temp);
        }
        //connected graph
//        list.get(0).add(1);
//        list.get(0).add(2);
//        list.get(1).add(0);
//        list.get(1).add(3);
//        list.get(1).add(4);
//        list.get(2).add(3);
//        list.get(2).add(0);
//        list.get(3).add(1);
//        list.get(3).add(2);
//        list.get(3).add(4);
//        list.get(4).add(1);
//        list.get(4).add(3);
//        dfs(list, V, 0);

        //disconnectedGraph
        list.get(0).add(1);
        list.get(0).add(2);
        list.get(1).add(0);
        list.get(1).add(2);
        list.get(2).add(0);
        list.get(2).add(1);
        list.get(3).add(4);
        list.get(4).add(3);
        dfsDisconnect(list, V, 0);
    }
    private static void dfs(ArrayList<ArrayList<Integer>> adj, int V, int s){
        boolean[] visited = new boolean[V];
        dfsRec(adj, visited, s);
    }
    //for disconnected graph all we have to do is call the dfs function for all the vertices that are marked false
    private static void dfsDisconnect(ArrayList<ArrayList<Integer>> adj, int V, int s){
        boolean[] vis = new boolean[V];
        for(int i = 0;i<V;i++){
            if(!vis[i]){
                dfsRec(adj, vis, i);
            }
        }
    }
    private static void dfsRec(ArrayList<ArrayList<Integer>> adj, boolean[] visited, int s){
        visited[s] = true;
        System.out.println(s + " ");
        for(Integer v : adj.get(s)){
            if(!visited[v]){
                dfsRec(adj, visited, v);
            }
        }
    }
}

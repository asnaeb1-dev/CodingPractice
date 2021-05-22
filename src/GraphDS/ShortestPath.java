package GraphDS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

//Shortest path in a unweighted graph
public class ShortestPath {
    public static void main(String[] args) {
        int V = 6;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(V);
        for(int i = 0;i<V;i++){
            ArrayList<Integer> temp = new ArrayList<>();
            list.add(temp);
        }
        list.get(0).add(1);
        list.get(0).add(2);
        list.get(0).add(4);
        list.get(1).add(0);
        list.get(1).add(3);
        list.get(2).add(0);
        list.get(2).add(3);
        list.get(2).add(4);
        list.get(3).add(1);
        list.get(3).add(2);
        list.get(3).add(5);
        list.get(4).add(2);
        list.get(4).add(0);
        list.get(4).add(5);
        list.get(5).add(3);
        list.get(5).add(4);

        int[] d = new int[V];
        shortestPath(list, d, V, 0);
        System.out.println(Arrays.toString(d));
    }
    private static void shortestPath(ArrayList<ArrayList<Integer>> list, int[] distance, int V, int s){
        boolean[] visited = new boolean[V];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[0] = 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        visited[s] = true;
        while(!q.isEmpty()){
            int u =  q.poll();
            for(int v : list.get(u)){
                if(!visited[v]){
                    distance[v] = distance[u] + 1;
                    visited[v] = true;
                    q.add(v);
                }
            }
        }
    }
}

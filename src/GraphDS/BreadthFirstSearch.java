package GraphDS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
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

//        list.get(0).add(1);
//        list.get(0).add(2);
//        list.get(0).add(5);
//        list.get(1).add(0);
//        list.get(1).add(3);
//        list.get(2).add(0);
//        list.get(2).add(4);
//        list.get(3).add(1);
//        list.get(3).add(5);
//        list.get(4).add(2);
//        list.get(4).add(5);
//        list.get(5).add(0);
//        list.get(5).add(3);
//        list.get(5).add(4);
        System.out.println(bfs(list, V, 0));
    }
    private static int bfs(ArrayList<ArrayList<Integer>> adj, int V, int s){
        // a boolean array is required to mark which cell is visited.
        boolean[] visited = new boolean[V];
        int count = 0;
        for(int i = 0;i<visited.length;i++){
            if(!visited[i]){
                count++;
                Queue<Integer> q = new LinkedList<>();
                q.add(i);
                visited[i] = true;
                while(!q.isEmpty()){
                    int u = q.poll();
                    //System.out.print(u + " ");
                    for(Integer v : adj.get(u)){
                        if(!visited[v]){
                            visited[v] = true;
                            q.add(v);
                        }
                    }
                }
            }
        }
        return count;
    }
}

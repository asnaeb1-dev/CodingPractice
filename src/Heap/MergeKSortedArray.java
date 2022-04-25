package Heap;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class MergeKSortedArray {
     class Data{
        int data;
        int listNo;
        int index;

        public Data(int data, int listNo, int index) {
            this.data = data;
            this.listNo = listNo;
            this.index = index;
        }
    }

    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3, 4, 5, 7},
                {1, 2, 4},
                {3, 5, 6}
        };
        MergeKSortedArray m = new MergeKSortedArray();
        ArrayList<Integer> al = m.merge(a, 3);
        for(Integer i : al)
            System.out.print(i +" ");
        System.out.println();
    }

    private ArrayList<Integer> merge(int[][] a, int k){
        ArrayList<Integer> al = new ArrayList<>();
         PriorityQueue<Data> pq = new PriorityQueue<>(k, ((o1, o2) -> o1.data - o2.data));
        for(int i = 0;i<k;i++){
            pq.add(new Data(a[i][0], i, 0));
        }

        while(!pq.isEmpty()){
            Data d = pq.remove();
            al.add(d.data);
            if(d.index + 1 != a[d.listNo].length){
                pq.add(new Data(a[d.listNo][d.index + 1], d.listNo, d.index + 1));
            }
        }
        return al;
    }
}

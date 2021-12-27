package GreedyAlgo;

import java.util.LinkedHashSet;

public class PageFaults {
    public static void main(String[] args) {
        int[] a = {3, 2, 0, 2, 5, 4, 1, 2};
        System.out.println(countPageFaults(a, 4, a.length));

    }
    private static int countPageFaults(int[] pages, int cap, int n){
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(pages[0]);
        int i = 1;
        int fault = 1;
        for(;i < n && i<cap;i++){
            if(!set.contains(pages[i])){
                fault++;
            }else{
                set.remove(pages[i]);
            }
            set.add(pages[i]);
        }

        for(;i<n;i++){
            if(!set.contains(pages[i])){
                fault++;
                if(set.size() == cap){
                    int k = set.iterator().next();
                    set.remove(k);
                }
            }else{
                set.remove(pages[i]);
            }
            set.add(pages[i]);
        }

        return fault;
    }
}

package Heap;

public class MaximumItems {
    public static void main(String[] args) {
        int[] a = {1, 12, 5, 111, 200};
        System.out.println(count(a, 10));
    }
    private static int count(int[] items, int s){
        if(s <= 0) return 0;
        int r = 0;
        for(int i = 0;i<items.length;i++){
            r = 1 + Math.max(count(items, s - items[i]), count(items, s));
        }
        return r;

    }
}

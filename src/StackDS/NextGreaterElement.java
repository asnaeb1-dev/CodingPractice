package StackDS;

import java.util.ArrayDeque;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] a = {6, 8, 0, 1, 3};
        find(a);
    }
    //naive - O(n ^ 2)
    private static void find(int[] a){
        for(int i = 0;i< a.length; i++){
            int j = i + 1;
            for(;j<a.length;j++){
                if(a[j] > a[i]){
                    System.out.print(a[j] + " ");
                    break;
                }
            }
            if(j == a.length){
                System.out.print(-1 +" ");
            }
        }
    }
}

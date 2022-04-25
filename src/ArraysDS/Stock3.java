package ArraysDS;

import java.util.Arrays;
import java.util.Stack;

public class Stock3 {
    public static void main(String[] args) {
        int[] p = {3, 3, 5, 0, 0, 3, 1, 4};
        bestTime(p);
    }
    private static int bestTime(int[] p){
        int[] nextGreater = nextGreater(p, p.length);
        System.out.println(Arrays.toString(nextGreater));

        int[] pro = new int[p.length];
        for (int i = 0, k = 0;i<pro.length;i++){
            if(nextGreater[i] != -1){
               // pro[k++] =
            }
        }

        return -1;
    }
    private static int[] nextGreater(int[] a, int n){
        Stack<Integer> s = new Stack<>();
        int[] res = new int[n];
        s.push(n - 1);
        res[n - 1] = -1;
        for(int i = n - 2;i>=0;i--){
            while(!s.empty() && a[s.peek()] <= a[i]){
                s.pop();
            }
            if(s.empty()){
                res[i] = -1;
            }else{
                res[i] = s.peek();
            }
            s.push(i);
        }
        return res;
    }
}

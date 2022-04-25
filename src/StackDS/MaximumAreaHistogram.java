package StackDS;

import java.util.Arrays;
import java.util.Stack;

public class MaximumAreaHistogram {
    public static void main(String[] args) {
        int[] a = {7, 2, 8, 9, 1, 3, 6, 5};
        System.out.println(maxAreaEff(a, a.length));
    }

    //time - O(n^2)
    //space - O(1)
    private static int maxArea(int[] a, int n){
        //6 2 5 4 1 5 6
        int max = 0;
        for(int i = 0;i<n;i++){
            int cov = 1;
            if(i != n - 1){
                for(int j = i + 1;j<n;j++){
                    if(a[j] >= a[i]){
                        cov++;
                    }else{
                        break;
                    }
                }
            }
            if(i != 0){
                for(int j = i - 1;j>=0;j--){
                    if(a[j] >= a[i]){
                        cov++;
                    }else{
                        break;
                    }
                }
            }
            if(cov * a[i] > max){
                max = cov * a[i];
            }
        }
        return max;
    }

    private static int maxAreaEff(int[] a, int n){
        int[] right = nextSmaller(a, a.length);
        int[] left = prevSmaller(a, a.length);

        int maxArea = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++) {
            int l = 0;
            if(left[i] != -1){
                l += i - (left[i] + 1);
            }else{
                l+= i;
            }

            if(right[i] != -1){
                l += right[i] - 1 - i;
            }else{
                l += (n - 1) - i;
            }

           // System.out.print(l +" ");
            int area = a[i] * (l + 1);
            maxArea = Integer.max(area, maxArea);
        }
        return maxArea;
    }

    private static int[] prevSmaller(int[] a, int n){
        Stack<Integer> s = new Stack<>();
        s.push(0);
        int[] r = new int[n];
        r[0] = -1;
        for(int i = 1;i<n;i++){
            while(!s.empty() && a[s.peek()] >= a[i]){
                s.pop();
            }
            if(s.empty()){
                r[i] = -1;
            }else{
                r[i] = s.peek();
            }
            s.push(i);
        }
        return r;
    }

    private static int[] nextSmaller(int[] a, int n){
        Stack<Integer> s = new Stack<>();
        s.push(n - 1);
        int[] r = new int[n];
        r[n - 1] = -1;
        for(int i = n - 2;i>=0;i--){
            while(!s.empty() && a[s.peek()] >= a[i]){
                s.pop();
            }
            if(s.empty()){
                r[i] = -1;
            }else{
                r[i] = s.peek();
            }
            s.push(i);
        }
        return r;
    }
}

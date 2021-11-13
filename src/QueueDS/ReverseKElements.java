package QueueDS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**Question -->
 * Given an integer K and a queue of integers,
 * we need to reverse the order of the first K elements of the queue, leaving the other elements in the same relative order.
 */
public class ReverseKElements {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q = modifyQueue(q, 3);
        while(!q.isEmpty()){
            System.out.print(q.poll() +" ");
        }
        System.out.println();
    }
    public static Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        // add code here.
        Stack<Integer> stack = new Stack<>();
        int i = k;

        while(!q.isEmpty() && i != 0 ){
            stack.push(q.poll());
            i--;
        }
        i = q.size();
        while(!stack.empty()){
            q.add(stack.pop());
        }

        while(i != 0){
            q.add(q.poll());
            i--;
        }
        return q;
    }
}

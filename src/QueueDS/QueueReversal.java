package QueueDS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueReversal {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(11);
        queue.add(12);

        Queue <Integer> q = reverseQueue(queue);
        while(!q.isEmpty()){
            System.out.print(q.poll());
        }
        System.out.println();
    }
    private static Queue<Integer> reverseQueue(Queue<Integer> queue){
        Stack<Integer> stack= new Stack<>();
        for(int i = 0;i< queue.size();i++){
            stack.push(queue.poll());
        }
        while(!stack.empty()){
            queue.add(stack.pop());
        }
        return queue;
    }
}

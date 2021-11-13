package LinkedList.DoublyLinkedList;

import java.util.ArrayList;

/**Question -->
 * Given a sorted doubly linked list of positive distinct elements,
 * the task is to find pairs in a doubly-linked list whose sum is equal to given value x, without using any extra space?
 */

public class PairSumDLL {
    public static void main(String[] args) {
        // 1 <-> 2 <-> 4 <-> 5 <-> 6 <-> 8 <-> 9
        NodeDLL head = new NodeDLL(1);
        head.nextNode = new NodeDLL(2);
        head.prev = null;
        head.nextNode.nextNode = new NodeDLL(4);
        head.nextNode.prev = head;
        head.nextNode.nextNode.nextNode = new NodeDLL(5);
        head.nextNode.nextNode.prev = head.nextNode;
        head.nextNode.nextNode.nextNode.nextNode = new NodeDLL(6);
        head.nextNode.nextNode.nextNode.prev = head.nextNode.nextNode;
        head.nextNode.nextNode.nextNode.nextNode.nextNode = new NodeDLL(8);
        head.nextNode.nextNode.nextNode.nextNode.prev = head.nextNode.nextNode.nextNode;
        head.nextNode.nextNode.nextNode.nextNode.nextNode.nextNode = new NodeDLL(9);
        head.nextNode.nextNode.nextNode.nextNode.nextNode.prev = head.nextNode.nextNode.nextNode.nextNode;
        ArrayList<ArrayList<Integer>> list = getPairs(head, 7);
        for(ArrayList<Integer> l : list){
            System.out.println(l.toString());
        }
    }
    private static ArrayList<ArrayList<Integer>> getPairs(NodeDLL head, int sum){
        NodeDLL tail = head;
        while(tail.nextNode != null){
            tail = tail.nextNode;
        }
        System.out.println(head.data);
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        while(head != tail){
            System.out.println(head.data + tail.data);
            if(head.data + tail.data == sum){
                head = head.nextNode;
                tail = tail.prev;
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(head.data);
                pair.add(tail.data);
                al.add(pair);
            }else if(head.data + tail.data > sum){
                tail = tail.prev;
            }else{
                head = head.nextNode;
            }
        }
        return al;
    }
}

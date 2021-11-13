package LinkedList.DoublyLinkedList;

public class RotateLinkedList {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        NodeDLL head = new NodeDLL(-1), temp = head;
        for (int j : a) {
            NodeDLL n = new NodeDLL(j);
            temp.nextNode = n;
            n.prev = temp;
            temp = temp.nextNode;
        }
        head = head.nextNode;
        NodeDLL x = rotate(head, 2);
        while(x!= null){
            System.out.print(x.data +" ");
            x = x.nextNode;
        }
    }
    private static NodeDLL rotate(NodeDLL head, int k){
        NodeDLL previous = null, curr = head;
        int i = 0;
        while(i != k){
            previous = curr;
            curr = curr.nextNode;
            i++;
        }
        NodeDLL temp = curr;
        previous.nextNode = null;
        curr.prev = null;
        while(temp.nextNode != null){
            temp = temp.nextNode;
        }
        temp.nextNode = head;
        head.prev = temp;
        head = curr;
        return head;
    }
}

package LinkedList;
// 1 -> 2 -> 3 -> 4 -> 5 -> null
public class MoveToFront {
    private static LLNode move(LLNode head){
        LLNode curr = head;
        while(curr.next.next != null){
            curr = curr.next;
        }
        LLNode temp = curr.next;
        curr.next = null;
        temp.next = head;
        head = temp;
        return head;

    }

    public static void main(String[] args) {
        LLNode head = new LLNode(1);
        head.next = new LLNode(2);
        head.next.next = new LLNode(3);
        head.next.next.next = new LLNode(4);
        head.next.next.next.next = new LLNode(5);
        LLNode h = move(head);
        while(h!= null){
            System.out.print(h.data +" ");
            h = h.next;
        }
        System.out.println();
    }
}

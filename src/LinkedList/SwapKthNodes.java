package LinkedList;

public class SwapKthNodes {
    public static void main(String[] args) {
        LLNode head = new LLNode(1);
        head.next = new LLNode(2);
        head.next.next = new LLNode(3);
        head.next.next.next = new LLNode(4);
        head.next.next.next.next = new LLNode(5);
        head.next.next.next.next.next = new LLNode(6);
        head.next.next.next.next.next.next = new LLNode(7);

        LLNode ret = swap(head, 3);
        while(ret != null){
            System.out.print(ret.data +" ");
            ret = ret.next;
        }
        System.out.println();
    }
    private static LLNode swap(LLNode head, int K){
        LLNode fast_ptr = head, slow_ptr = head, fromHead = head;
        int i = K;
        while(i != 0 && fast_ptr != null){
            fast_ptr = fast_ptr.next;
            i--;
        }
        while(fast_ptr != null){
            fast_ptr = fast_ptr.next;
            slow_ptr = slow_ptr.next;
        }
        i = K - 1;
        while(i != 0 && fromHead != null){
            fromHead = fromHead.next;
            i--;
        }

        int temp = fromHead.data;
        fromHead.data = slow_ptr.data;
        slow_ptr.data = temp;
        return head;
    }
}

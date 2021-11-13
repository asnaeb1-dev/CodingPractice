package LinkedList;

public class ReverseKLinkedList {
    public static void main(String[] args) {

    }
    private static LLNode reverse(LLNode head, int k){
        if(head == null){
            return null;
        }
        LLNode curr = head;
        LLNode prev = null;
        LLNode Next = null;
        int i = 0;
        while(curr != null && i != k){
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
            i++;
        }
        if(Next != null){
            head.next = reverse(Next, k);
        }
        return prev;
    }
}

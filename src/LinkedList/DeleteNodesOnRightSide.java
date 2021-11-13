package LinkedList;

/**Question -->
 * Given a singly linked list, remove all the LLNodes which have a greater value on its following LLNodes.
 *
 * Example 1:
 *
 * Input:
 * LinkedList = 12->15->10->11->5->6->2->3
 * Output: 15 11 6 3
 * Explanation: Since, 12, 10, 5 and 2 are
 * the elements which have greater elements
 * on the following LLNodes. So, after deleting
 * them, the linked list would like be 15,
 * 11, 6, 3.
 * Example 2:
 *
 * Input:
 * LinkedList = 10->20->30->40->50->60
 * Output: 60
 */
public class DeleteNodesOnRightSide {
    LLNode compute(LLNode head)
    {
        // your code here
        if(head == null) return null;
        LLNode h = reverseList(head);
        LLNode prev = h, curr = null;
        if(h.next != null){
            curr = h.next;
        }

        int max = h.data;
        while(curr != null){
            if(curr.data < max){
                curr = curr.next;
                prev.next = curr;
            }else{
                max = curr.data;
                curr = curr.next;
                prev = prev.next;
            }
        }

        return reverseList(h);
    }
    LLNode reverseList(LLNode head){
        LLNode curr = head, prev = null, Next = null;
        while(curr != null){
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }
        return prev;
    }
}

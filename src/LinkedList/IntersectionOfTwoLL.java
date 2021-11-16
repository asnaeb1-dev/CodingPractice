package LinkedList;

/**Question -->
 * Given two lists sorted in increasing order, create a new list representing the intersection of the two lists.
 * The new list should be made with its own memory — the original lists should not be changed.
 * Note: The list elements are not necessarily distinct.
 *
 * Example 1:
 *
 * Input:
 * L1 = 1->2->3->4->6
 * L2 = 2->4->6->8
 * Output: 2 4 6
 * Explanation: For the given first two
 * linked list, 2, 4 and 6 are the elements
 * in the intersection.
 * Example 2:
 *
 * Input:
 * L1 = 10->20->40->50
 * L2 = 15->40
 * Output: 40
 */
public class IntersectionOfTwoLL {
    public static LLNode findIntersection(LLNode head1, LLNode head2) {
        LLNode h3 = new LLNode(-1), c = h3;
        while(head1 != null && head2 != null){
            if(head1.data.equals(head2.data)){
                c.next = new LLNode(head1.data);
                head1 = head1.next;
                head2 = head2.next;
                c = c.next;
            }else if(head1.data < head2.data){
                head1 = head1.next;
            }else{
                head2 = head2.next;
            }
        }
        return h3.next;
    }
}

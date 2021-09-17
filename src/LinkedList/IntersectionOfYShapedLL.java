package LinkedList;

import java.util.LinkedHashSet;

/**QUESTION
 * Given two singly linked lists of size N and M, write a program to get the point where two linked lists intersect each other.
 */

public class IntersectionOfYShapedLL {
    int intersectPoint(LLNode head1, LLNode head2)
    {
        // code here
        LinkedHashSet<LLNode> set = new LinkedHashSet<>();
        while(head1 != null){
            set.add(head1);
            head1 = head1.next;
        }

        while(head2 != null){
            if(set.contains(head2)){
                return head2.data;
            }
            head2 = head2.next;
        }
        return -1;
    }
}

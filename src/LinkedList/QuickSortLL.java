package LinkedList;

/**
 * Partition algorithm used - Lomuto partition algorithm used
 */
public class QuickSortLL {
    public static void main(String[] args) {
        int[] a = {9, 8, 7, 19, 18};
        LLNode head = new LLNode(-1), temp = head;
        for (int j : a) {
            temp.next = new LLNode(j);
            temp = temp.next;
        }
        head = head.next;
        LLNode tail = head;
        while(tail.next != null ){
            tail = tail.next;
        }

        quickSort(head, tail);
        while(head!= null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    private static void quickSort(LLNode start, LLNode end){
        if(start == null || start == end|| start == end.next )
            return;

        // split list and partition recurse
        LLNode pivot_prev = partition(start, end);
        quickSort(start, pivot_prev);

        // if pivot is picked and moved to the start,
        // that means start and pivot is same
        // so pick from next of pivot
        if (pivot_prev != null && pivot_prev == start)
            quickSort(pivot_prev.next, end);

            // if pivot is in between of the list,
            // start from next of pivot,
            // since we have pivot_prev, so we move two nodes
        else if (pivot_prev != null
                && pivot_prev.next != null)
            quickSort(pivot_prev.next.next, end);
    }
    private static LLNode partition(LLNode start, LLNode end){
        if (start == end || start == null || end == null)
            return start;

        LLNode pivot_prev = start;
        LLNode curr = start;
        int pivot = end.data;

        // iterate till one before the end,
        // no need to iterate till the end
        // because end is pivot
        while (start != end) {
            if (start.data < pivot) {
                // keep tracks of last modified item
                pivot_prev = curr;
                int temp = curr.data;
                curr.data = start.data;
                start.data = temp;
                curr = curr.next;
            }
            start = start.next;
        }

        // swap the position of curr i.e.
        // next suitable index and pivot
        int temp = curr.data;
        curr.data = pivot;
        end.data = temp;

        // return one previous to current
        // because current is now pointing to pivot
        return pivot_prev;
    }
}

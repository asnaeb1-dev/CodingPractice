package LinkedList;

public class FindMidOfLL {
    public static void main(String[] args) {
        int[] a = {1, 5, 7};
        LLNode head = new LLNode(-1), temp = head;
        for (int j : a) {
            temp.next = new LLNode(j);
            temp = temp.next;
        }
        System.out.println(getMid(head.next));
    }
    private static int getMid(LLNode head){
        LLNode slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
}

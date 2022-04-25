package LinkedList;

public class PalindromeCheck {
    public static void main(String[] args) {
        LLNode root = new LLNode(1);
        root.next = new LLNode(2);
        root.next.next = new LLNode(2);
        root.next.next.next = new LLNode(1);
        //root.next.next.next.next = new LLNode(1);

        boolean res = isPalindrome(root);
        System.out.println(res);
    }
    private static boolean isPalindrome(LLNode head){
        LLNode slow = head, fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        LLNode rev = reverse(slow.next);
        LLNode curr = head;
        while(rev != null){
            if(rev.data != curr.data) return  false;
            rev = rev.next;
            curr = curr.next;
        }
        return true;
    }

    private static LLNode reverse(LLNode mid){
        LLNode curr = mid, prev = null, Next = null;
       while(curr != null){
           Next = curr.next;
           curr.next = prev;
           prev = curr;
           curr = Next;
       }
       return prev;
    }
}

package StackDS;

public class MiddleElement {
    class DLLNode {
        int data;
        DLLNode next;
        DLLNode prev;

        public DLLNode(int data) {
            this.data = data;
            next = null;
            prev = null;
        }
    }

        DLLNode head = null, tail = null, mid = null;
        int count = 0;

        void push(int data){
            DLLNode node = new DLLNode(data);
            count++;
            if(head == null){
                head = node;
                tail = node;
                mid = node;
            }else{
                tail.next = node;
                node.prev = tail;
                tail = node;
                if(count % 2 == 0){
                    mid = mid.next;
                }
            }
        }
        int getMiddle(){
            if(mid == null) return -1;
            return mid.data;
        }

        int deleteMiddle(){
            if(mid == null) return -1;
            int deletedElement = mid.data;
            DLLNode tempNode = mid;
            count--;
            if(count % 2 != 0){
                mid = mid.prev;
            }else{
                mid = mid.next;
            }

            tempNode.prev.next = tempNode.next;
            tempNode.next.prev = tempNode.prev;
            tempNode.next = null;
            tempNode.prev = null;
            return deletedElement;
        }

        public static void main(String[] args) {
            MiddleElement mid = new MiddleElement();
            mid.push(10);
            mid.push(20);
            mid.push(30);
            mid.push(40);
            mid.push(50);

            System.out.println(mid.getMiddle());
            System.out.println(mid.deleteMiddle());
            System.out.println(mid.getMiddle());
        }
    }

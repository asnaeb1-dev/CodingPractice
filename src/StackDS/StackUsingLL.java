package StackDS;

class StackUsingLL {
    StackNode top;

    private void push(int data){
        StackNode node = new StackNode(data);
        if (top != null) {
            node.next = top;
        }
        top = node;
    }

    private int pop(){
        if(top != null){
            int r = top.data;
            top = top.next;
            return r;
        }
        return -1;
    }
    private int peek(){
        if(top != null){
            return top.data;
        }
        return -1;
    }

    private void displayStack(){
        while(top != null){
            System.out.print(top.data + " ");
            top = top.next;
        }
        System.out.println();
    }

    public void main(String[] args) {
        StackUsingLL stack = new StackUsingLL();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.displayStack();
    }
}

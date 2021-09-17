package StackDS;

/**Q - using array
 * Stack is a linear data structure
 */
public class StackX<I extends Number> {
    private static int[] arr;
    private int capacity;
    private static int top = -1;

    public StackX(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
    }

    private static void push(int data){
        if(top == arr.length - 1){
            return;
        }
        top++;
        arr[top] = data;
    }
    private static int pop(){
        if(top == -1){
            return -1;
        }
        int r = arr[top];
        top--;
        return r;
    }
    private static int peek(){
        if(top == -1){
            return  -1;
        }
        return arr[top];
    }

    private void displayStack(){
        for ( int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackX<Integer> stack = new StackX<>(100);
        push(10);
        push(20);
        push(30);
        push(40);
        //stack.displayStack();
        System.out.println(peek());
    }
}

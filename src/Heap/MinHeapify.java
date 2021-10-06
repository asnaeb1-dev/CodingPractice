package Heap;

public class MinHeapify {
    int[] arr = {20, 25, 30, 35, 40, 80, 32, 100, 70, 60};
    int s = arr.length;

    int getLeftChild(int i){
        return (2 * i) + 1;
    }

    int getRightChild(int i){
        return (2 * i) + 2;
    }
    public void minHeapify(int i){
        int lt = getLeftChild(i);
        int rt = getRightChild(i);
        int smallest = i;
        if(lt < s && arr[i] > arr[lt]){
            smallest = lt;
        }
        if(rt < s && arr[i] > arr[smallest]){
            smallest = rt;
        }
        if(smallest != i){
            int t = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = t;
            minHeapify(smallest);
        }
    }

    public int getMin(){
        if(s == 0) return Integer.MIN_VALUE;
        int min = arr[0];
        int t = arr[0];
        arr[0] = arr[s - 1];
        arr[s - 1] = t;
        s--;
        minHeapify(0);
        return min;
    }

    public void printHeap(){
        for(int i =0;i<s;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MinHeapify minHeap = new MinHeapify();
        minHeap.printHeap();
        System.out.println(minHeap.getMin());
        minHeap.printHeap();
    }
}

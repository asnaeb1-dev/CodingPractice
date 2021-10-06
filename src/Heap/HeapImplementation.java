package Heap;

public class HeapImplementation {
    int[] arr;
    int capacity;
    int size;

    public HeapImplementation(int c) {
        this.capacity = c;
        arr = new int[capacity];
        size = 0;
    }

    public int getParent(int i){
        if(i != 0){
            return (int) Math.floor((i - 1) / 2);
        }
        return -1;
    }

    public int getLeftChild(int i){
        return ((2 * i) + 1);
    }

    public int getRightChild(int i){
        return ((2 * i) + 2);
    }

    public void insertValue(int val){
        if(size == capacity){
            return;
        }
        size++;
        arr[size - 1] = val;
        int i = size -1;
        while(i != 0 && arr[getParent(i)] > arr[i]){
            int t = arr[i];
            arr[i] = arr[getParent(i)];
            arr[getParent(i)] = t;
            i = getParent(i);
        }
    }
    public void minHeapify(int i){
        int lt = getLeftChild(i);
        int rt = getRightChild(i);
        int smallest = i;
        if(lt < size && arr[i] > arr[lt]){
            smallest = lt;
        }
        if(rt < size && arr[i] > arr[rt]){
            smallest = rt;
        }
        if(smallest != i){
            int t = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = t;
            minHeapify(smallest);
        }
    }
    public void printHeap(){
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        HeapImplementation heap = new HeapImplementation(10);
        heap.insertValue(10);
        heap.insertValue(20);
        heap.insertValue(15);
        heap.insertValue(40);
        heap.insertValue(50);
        heap.insertValue(100);
        heap.insertValue(25);
        heap.insertValue(45);
        heap.insertValue(12);
        heap.insertValue(14);
        heap.insertValue(23);
        heap.printHeap();
    }
}

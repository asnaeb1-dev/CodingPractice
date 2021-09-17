package Heap;

/**
 * Here, all the heap basic operations are done
 */
public class HeapOperations {

    static int[] heap = {10, 5, 20, 2, 4, 8};
    static int size = heap.length - 1, capacity = heap.length;

    public static void main(String[] args) {
//        h[0] = 10;
//        h[1] = 20;
//        h[2] = 15;
//        h[3] = 40;
//        h[4] = 50;
//        h[5] = 100;
//        h[6] = 25;
//        h[7] = 45;
        //insert(h, 10, 8, 12);
        //heapify(h, 0, 10, 10);
        /*System.out.println(extractMin(size, heap));
        for(int i = 0;i<size;i++){
            System.out.print(heap[i] + " ");
        }
        System.out.println();*/

        //decreaseKey(3, 5);
//        deleteKey(3);
        buildHeap();
        for(int i = 0;i<capacity;i++){
            System.out.print(heap[i] + " ");
        }
    }
    private static void insert(int[] heap, int cap, int size, int el){
        if(size == cap){
            return;
        }
        size++;
        heap[size - 1] = el;
        int i = size - 1;
        while(i != 0 && heap[i] < heap[(i - 1) / 2]){
            int t = heap[i];
            heap[i] = heap[(i - 1)/ 2];
            heap[(i - 1)/ 2] = t;
            i = (i - 1) / 2;
        }
    }
    private static void minHeapify(int[] heap, int i, int size, int cap){
        int lt = 2 * i + 1;
        int rt = 2 * i + 2;
        int smallest = i;
        if(lt <size && heap[lt] < heap[smallest]){
            smallest = lt;
        }
        if(rt < size && heap[rt] < heap[smallest]){
            smallest = rt;
        }

        if(smallest != i){
            int temp = heap[i];
            heap[i] = heap[smallest];
            heap[smallest] = temp;

            minHeapify(heap, smallest, size, cap);
        }
    }

    private static int extractMin(int size, int[] heap){
        if(size == 0){
            return -1;
        }
        //to avoid any errors related to size as size will become zero and then it will throw errors
        if(size == 1){
            size--;
            return heap[size];
        }
        int r = heap[0];
        int temp = heap[0];
        heap[0] = heap[size];
        heap[size] = temp;
        size--;
        minHeapify(heap, 0, size, heap.length);
        return r;
    }

    private static void decreaseKey(int i, int x){
        if(i > size){
            return;
        }
        heap[i] = x;
        while(i != 0 && heap[(i - 1)/2] > heap[i]){
            int temp = heap[(i - 1)/ 2];
            heap[(i - 1)/ 2] = heap[i];
            heap[i] = temp;

            i = (i - 1)/ 2;
        }
    }

    private static int deleteKey(int i){
        if(i > size){
            return -1;
        }
        decreaseKey(i, Integer.MIN_VALUE);
        return extractMin(size, heap);
    }

    private static void buildHeap(){
        for(int i = (size - 2)/2;i>=0;i--){
            minHeapify(heap, i, size, capacity);
        }
    }
}

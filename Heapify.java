package ADI_ETE;

import java.util.*;


public class Heapify {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size of the array
        int N = scanner.nextInt();

        // Input array elements
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        // Perform heapify to convert the array into a Min Heap
        heapify(arr, N);

        // Print the Min Heap
        printMinHeap(arr);
    }

    private static void heapify(int[] arr, int N) {
        // Start from the last non-leaf node and move up
        for (int i = (N / 2) - 1; i >= 0; i--) {
            minHeapify(arr, N, i);
        }
    }

    private static void minHeapify(int[] arr, int N, int index) {
        int smallest = index;
        int leftChild = 2 * index + 1;
        int rightChild = 2 * index + 2;

        // Compare with left child
        if (leftChild < N && arr[leftChild] < arr[smallest]) {
            smallest = leftChild;
        }

        // Compare with right child
        if (rightChild < N && arr[rightChild] < arr[smallest]) {
            smallest = rightChild;
        }

        // Swap if needed and recursively heapify the affected subtree
        if (smallest != index) {
            int temp = arr[index];
            arr[index] = arr[smallest];
            arr[smallest] = temp;

            minHeapify(arr, N, smallest);
        }
    }

    private static void printMinHeap(int[] arr) {
        // Print the Min Heap
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for(int i=0; i<n; i++){
//            arr[i] = sc.nextInt();
//        }
//
//        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
//        for(int num : arr){
//            minHeap.add(num);
//        }
//
//        int i=0;
//        while(!minHeap.isEmpty()){
//            arr[i++] = minHeap.poll();
//        }
//
//        for(int num : arr){
//            System.out.print(num + " ");
//        }
//    }
}


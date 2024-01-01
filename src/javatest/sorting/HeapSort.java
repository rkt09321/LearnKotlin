package javatest.sorting;

// Java program for implementation of Heap Sort
// Video Url
// https://www.youtube.com/watch?v=MtQL_ll5KhQ&list=PLqM7alHXFySHrGIxeBOo4-mKO4H8j2knW
// Complexity
// Time Complexity:
//Best case : O(nlogn)
//Average case : O(nlogn)
//Worst case : O(nlogn)
// space complexity: O(n)
//Since heap sort is in place sorting algorithm, space complexity is o(1).
// You don’t need any extra space except swapping variable in heap sort.
public class HeapSort {
    public void sort(int arr[]) {
        int arraySize = arr.length;

        // Build heap (rearrange javatest.array)
        for (int i = arraySize / 2 - 1; i >= 0; i--)
            heapify(arr, arraySize, i);

        // System.out.println("MaxHeapAre "+ Arrays.toString(arr));

        // One by one extract an element from heap
        for (int i = arraySize - 1; i >= 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    // To heapify a subtree rooted with node i which is
    // an index in arr[]. arrayLength is size of heap
    void heapify(int arr[], int arrayLength, int i) {
        int largest = i;  // Initialize largest as root
        int leftChildIndex = 2 * i + 1;  // left = 2*i + 1
        int rightChildIndex = 2 * i + 2;  // right = 2*i + 2

        // If left child is larger than root
        if (leftChildIndex < arrayLength && arr[leftChildIndex] > arr[largest])
            largest = leftChildIndex;

        // If right child is larger than largest so far
        if (rightChildIndex < arrayLength && arr[rightChildIndex] > arr[largest])
            largest = rightChildIndex;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, arrayLength, largest);
        }
    }

    /* A utility function to print javatest.array of size n */
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver program
    public static void main(String args[]) {
        int arr[] = {12, 11, 13, 5, 6, 7, 12};
        HeapSort ob = new HeapSort();
        ob.sort(arr);
        printArray(arr);
    }
}

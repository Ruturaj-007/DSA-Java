package sorting;

public class QuickSort {

    // Swap elements at indices i and j in the array
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Print the array
    static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    // Partition function: places the pivot element at its correct position
    // and ensures elements <= pivot are on the left and > pivot on the right
    static int partition(int[] arr, int lo, int hi){
        int pivot = arr[lo];       // Choosing the first element as the pivot
        int pivotIdx = lo;
        int smallercount = 0;

        // Count how many elements are smaller or equal to the pivot
        for(int i = lo + 1; i <= hi; i++){
            if(arr[i] <= pivot) smallercount++;
        }

        // Determine the correct index where the pivot should go
        int correctIdx = pivotIdx + smallercount;

        // Move the pivot to its correct position
        swap(arr, pivotIdx, correctIdx);

        // Partition the array around the pivot
        int i = lo, j = hi;
        while(i < correctIdx && j > correctIdx){
            if(arr[i] <= pivot) i++;
            else if(arr[j] > pivot) j--;
            else if(arr[i] > pivot && arr[j] <= pivot) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        // Return the final position of the pivot
        return correctIdx;
    }

    // Recursive quicksort function
    static void quicksort(int[] arr, int lo, int hi){
        if(lo >= hi) return;  // Base case: single or zero element segment

        // Partition the array and get the correct pivot position
        int idx = partition(arr, lo, hi);

        // Recursively sort the left and right partitions
        quicksort(arr, lo, idx - 1);
        quicksort(arr, idx + 1, hi);
    }

    public static void main(String[] args) {
        int[] arr = {4, 9, 7, 1, 2, 3, 6, 5, 8};
        int n = arr.length;
        print(arr);
        quicksort(arr, 0, n - 1);
        print(arr);
    }
}

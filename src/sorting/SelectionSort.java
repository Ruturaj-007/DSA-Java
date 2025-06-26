package sorting;

public class SelectionSort {

    // Function to print the array
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1}; // Unsorted input array
        int n = arr.length;

        System.out.print("Original Array: ");
        print(arr);

        // Outer loop to iterate over each element except the last one
        for (int i = 0; i < n - 1; i++) {
            int min = Integer.MAX_VALUE; // Assume current minimum is the largest possible
            int minIdx = -1;             // Index of the current minimum
            for (int j = i; j < n; j++) {// Inner loop to find the minimum element in the unsorted part
                if (arr[j] < min) {
                    min = arr[j];        // Update the minimum value
                    minIdx = j;          // Update the index of the minimum
                }
            }
            int temp = arr[i];           // Swap min ele with 1st unsorted ele
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }

        System.out.print("Sorted Array:   ");
        print(arr);
    }
}

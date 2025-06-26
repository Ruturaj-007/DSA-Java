package sorting;

public class BubbleSort_Optimised {

    // Function to print the array
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};    // Worst case
        int n = arr.length;

        System.out.print("Original Array: ");
        print(arr);

        // Outer loop for passes (total n-1 passes needed)
        for (int x = 0; x < n - 1; x++) {
            boolean flag = true; // Assume no swaps will happen in this pass

            // Inner loop for comparing adjacent elements
            // Optimized to skip already sorted elements at the end
            for (int i = 0; i < n - 1 - x; i++) {
                if (arr[i] > arr[i + 1]) {
                    // Swap arr[i] and arr[i + 1] if out of order
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                    flag = false; // A swap happened, so array wasn't sorted
                }
            }

            // If no swaps happened in the entire pass, array is already sorted
            if (flag) break;
        }

        System.out.print("Sorted Array:   ");
        print(arr);
    }
}

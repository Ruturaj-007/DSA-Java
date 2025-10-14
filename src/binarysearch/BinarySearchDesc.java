package binarysearch;

public class BinarySearchDesc {
    public static void main(String[] args) {
        int[] arr = {90, 75, 19, 12, 6, 4, 3, 1};
        int target = 75;
        int result = binarySearch(arr, target);
        System.out.println("Number exists on index: " + result);
    }

    // return the index
    // return -1 if it does not exist
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length;

        while(start < end) {
            // find the middle element
            // int mid = (start + end) / 2; // exceeds range of integers in case of large numbers(integer overflow issue)
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) start = mid + 1;
            else if(target > arr[mid]) end = mid - 1;
            else return mid; // answer found
        }
        return -1;
    }
}

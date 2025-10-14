package binarysearch;

public class BinarySearchAlgo {
    public static void main(String[] args) {
        int[] arr = {-18, -12, 2, 3, 4, 15 , 16, 19, 22, 122};
        int target = 22;
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

            if (target < arr[mid]) end = mid - 1;
            else if(target > arr[mid]) start = mid + 1;
            else return mid; // ans found
        }
        return -1;
    }
}

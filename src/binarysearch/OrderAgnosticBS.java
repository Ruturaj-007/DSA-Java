package binarysearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {90, 75, 19, 12, 6, 4, 3, 1};
        int target = 75;
        int result = binarySearch(arr, target);
        System.out.println("Number exists on index: " + result);
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];
        if (arr[start] < arr[end]) {
            System.out.println("Array order is ascending");
        }
        else {
            System.out.println("Array order is descending");
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) return mid;

            if (isAsc) {
                if (target < arr[mid]) end = mid - 1;
                else start = mid + 1;
            } else {
                if (target > arr[mid]) end = mid - 1;
                else start = mid + 1;
            }
        }
        return -1;
    }
}

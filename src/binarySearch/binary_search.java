package binarySearch;

public class binary_search {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int len = arr.length;
        int lo = 0, hi = len - 1, target = 4;
        boolean flag = false;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == target) {
                flag = true;
                break;
            } else if (arr[mid] < target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        if (flag) System.out.println("Target found!");
        else System.out.println("Target not found!");
    }
}

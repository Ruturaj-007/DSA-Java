package binarySearch;

public class lowerBound {
    public static int findLowerBound(int[] arr) {
        int n = arr.length;
        int lo=0, hi=n-1;
        int target=25, lb=n;

        while(lo<=hi) {
            // Check if mid element is >= target
            int mid = lo+(hi-lo)/2;
            if(arr[mid]>=target){
                lb = Math.min(lb,mid);  // Look for a smaller index on the left
                hi = mid-1;
            }
            else lo = mid+1;            // Search in the right half
        }
        return lb;
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,30,40,50,60,70};
        System.out.println(findLowerBound(arr));
    }
}

package binarySearch;

public class linearSearch {
    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = 19;
        int ans = linerSearch(nums, target);
        System.out.println(ans);
    }


//    Search in the array : return the index if item found
//    otherwise if item not found return -1
    static int linerSearch(int[] arr, int target) {
        if (arr.length==0) {
            return -1;
        }

        // run a for loop
        for (int index = 0; index < arr.length; index++) {
            // check for element for every index if it is = target
            int element = arr[index];
            if (element==target) {
                return index;
            }
        }
    // this line will get executed if none of the statements will get executed
    // hence the target not found
        return -1;
    }
}

package sorting;

public class BubbleSort {
    public static void print(int[] arr){
        for(int ele: arr){                  // Print Array
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int n = arr.length;
        print(arr);
        for(int x=0;x<n-1;x++){          // Outer loop → runs from 0 to n-2 → exactly n-1 passes.
            for(int i=0;i<n-1-x;i++){    // Inner loop → runs from 0 to n-2 - x → compares adjacent pairs that are still unsorted.
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];   // Swapping
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        print(arr);
    }
}


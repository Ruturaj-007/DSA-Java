package Arrays;

public class swap {
    public static void main(String[] args) {
        int[] arr = {1, 2, 33, 9, 18};
        print(arr);
        swap(arr, 1, 3);
        print(arr);
    }
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele+ " ");
        }
        System.out.println();
    }
}

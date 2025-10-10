package functions;

public class for_each {
    public static void print(int[] arr) {
        for (int ele:arr) {
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        print(arr);
    }
}

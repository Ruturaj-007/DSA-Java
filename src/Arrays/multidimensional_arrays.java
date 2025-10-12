package Arrays;

import java.util.Scanner;

public class multidimensional_arrays {
    public static void main(String[] args) {
    Scanner in  = new Scanner(System.in);

        // take matrix size
        System.out.print("Enter number of rows: ");
        int row = in.nextInt();
        System.out.print("Enter number of columns: ");
        int col = in.nextInt();

        int[][] arr = new int[row][col];
        System.out.println("Enter elements in matrix");
        
        // input
        for (row = 0; row < arr.length; row++) {            // arr.length give no of rows
            for (col = 0; col < arr[row].length; col++) {   // for each col in every row
                arr[row][col] = in.nextInt();
            }
        }

        // print
        for (row = 0; row < arr.length; row++) {            // arr.length give no of rows
            for (col = 0; col < arr[row].length; col++) {   // for each col in every row
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }
}

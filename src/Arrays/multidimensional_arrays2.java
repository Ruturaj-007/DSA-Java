package Arrays;

import java.util.Scanner;

public class multidimensional_arrays2 {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int[][] arr = {
                {1, 2, 3},      // 0th index
                {4, 5},         // 1st index
                {6, 7, 8, 9}    // 2nd index
        };

        // print
        for (int row = 0; row < arr.length; row++) {            // arr.length give no of rows
            for (int col = 0; col < arr[row].length; col++) {   // for each col in every row
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }
}

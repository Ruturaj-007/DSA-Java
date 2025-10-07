package functions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        sum();
        sum();
    }
    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number 1 : ");
        int num1 = in.nextInt();
        System.out.println("Enter a number 2 : ");
        int num2 = in.nextInt();
        int sum  = num2+num1;
        System.out.println("Sum of 2 numbers is " + sum);

    }
}

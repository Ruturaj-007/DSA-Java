package basics;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.println("Enter fruit name : ");
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit) {
            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Apple":
                System.out.println("Sweet and red fruit");
                // keep on printing until it hits break condition
            case "Orange":
                System.out.println("Round fruit");
                break;
            case "Grapes":
                System.out.println("Small fruit");
                break;
            default:
                System.out.println("Enter a valid fruit");
        }
    }
}

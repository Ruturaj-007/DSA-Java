package linearsearch;

import java.util.ArrayList;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 2, 3},
                {3, 2, 1}
        };
        int richestMan = maximumWealth(accounts);
        System.out.println("The richest customer wealth is: " + richestMan);
    }
    static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int[] customer : accounts) {
            int sum = 0;

            // Add all bank balances of this customer
            for (int money : customer) {
                sum+=money;
            }

            // Track the richest customer
            if (maxWealth < sum) {
                maxWealth = sum;
            }
        }

        return maxWealth;
    }
}

package solving;

import java.util.Arrays;

public class ElectronicsShop {

    //    https://www.hackerrank.com/challenges/electronics-shop/problem
    public static void main(String[] args) {
        int[] k1 = {3, 2};
        int[] d1 = {5, 2, 8};
        System.out.println(getMoneySpent(k1, d1, 10));
        System.out.println(getMoneySpent(DateStringTest.arrayKey, DateStringTest.arrayDiv, 10554));

    }

    public static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int totalCost = 0;
        Arrays.sort(keyboards);
        Arrays.sort(drives);
        System.out.println(keyboards[0]);
        System.out.println(drives[0]);
        if (keyboards[0] + drives[0] > b) {
            return -1;
        } else {
            for (int i = 0; i < keyboards.length; i++) {
                for (int j = 0; j < drives.length; j++) {
                    if ((keyboards[i] + drives[j] <= b) && (keyboards[i] + drives[j] > totalCost)) {
                        totalCost = keyboards[i] + drives[j];
                    }
                }
            }
            return totalCost;
        }
    }
}
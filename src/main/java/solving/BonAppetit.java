package solving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BonAppetit {

    public static void main(String[] args) {
        List<Integer> bill = new ArrayList<>(Arrays.asList(3, 10, 2, 9));
        bonAppetit(bill, 1, 12);
        List<Integer> bill1 = new ArrayList<>(Arrays.asList(3, 10, 2, 9));
        bonAppetit(bill, 1, 7);
    }

    private static void bonAppetit(List<Integer> bill, int k, int b) {
        int sumBillAnn = 0;
        for (int i = 0; i < bill.size(); i++) {
            sumBillAnn += bill.get(i);
        }
        int billAnn = (sumBillAnn - bill.get(k)) / 2;
        if (billAnn >= b) {
            System.out.println("Bon Appetit");
        } else {
            int billAdd = b - billAnn;
            System.out.println(billAdd);
        }
    }
}

package solving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BetweenTwoSets {

    public static void main(String[] args) {
        List<Integer> a0 = new ArrayList<>(Arrays.asList(2, 4));
        List<Integer> b0 = new ArrayList<>(Arrays.asList(16, 32, 96));
        System.out.println(getTotalX(a0, b0));
        List<Integer> a1 = new ArrayList<>(Arrays.asList(3, 4));
        List<Integer> b2 = new ArrayList<>(Arrays.asList(24, 48));
        System.out.println(getTotalX(a1, b2));
    }

    private static int getTotalX(List<Integer> a, List<Integer> b) {

        int count = 0;
        int lastA = a.get(a.size() - 1);
        int firstB = b.get(0);
        int temp = lastA;
        while (temp <= firstB) {
            boolean check = true;
            for (int i : a) {
                if (temp % i != 0) {
                    check = false;
                    break;
                }
            }
            for (int j : b) {
                if (j % temp != 0) {
                    check = false;
                    break;
                }
            }
            count = check ? ++count : count;
            temp += lastA;
        }
        return count;
    }
}

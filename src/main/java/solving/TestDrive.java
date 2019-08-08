package solving;

import java.util.ArrayList;
import java.util.Arrays;

public class TestDrive {

    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>(Arrays.asList(1, 3, 4));
        ArrayList<Integer> b1 = new ArrayList<>(Arrays.asList(2, 6, 9));
        merge(a1, b1);
        System.out.println();
    }

    private static void merge(ArrayList<Integer> a, ArrayList<Integer> b) {

        int aSizeArr = a.size();
        int bSizeArr = b.size();
        int i = 0;
        int j = 0;
        int k = 0;
        Integer[] result = new Integer[aSizeArr + bSizeArr];
        while (i < aSizeArr && j < bSizeArr) {
            if (a.get(i) <= b.get(j)) {
                result[k] = a.get(i);
                i += 1;
                k += 1;
            } else {
                result[k] = b.get(j);
                j += 1;
                k += 1;
            }
        }

        while (i < aSizeArr) {
            result[k] = a.get(i);
            i += 1;
            k += 1;
        }

        while (j < bSizeArr) {
            result[k] = b.get(j);
            j += 1;
            k += 1;
        }

        a = new ArrayList<>(Arrays.asList(result));
        System.out.println(a.toString());
    }

}
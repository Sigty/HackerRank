package solving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PickingNumbers {

//    https://www.hackerrank.com/challenges/picking-numbers/problem

    public static void main(String[] args) {
        System.out.println("Loop:");
        List<Integer> listInt = new ArrayList<>(Arrays.asList(4, 6, 5, 3, 3, 1));
        System.out.println(pickingNumbers(listInt));
        List<Integer> listInt2 = new ArrayList<>(Arrays.asList(1, 2, 1));
        System.out.println(pickingNumbers(listInt2));
        System.out.println("Stream:");
        System.out.println(pickingNumbersStream(listInt));
        System.out.println(pickingNumbersStream(listInt2));
    }

    public static int pickingNumbers(List<Integer> a) {
        Collections.sort(a);
        int result = 0;
        for (int i = 0; i < a.size(); i++) {
            int count = 0;
            for (int j = i; j < a.size(); j++) {
                if (Math.abs(a.get(j) - a.get(i)) <= 1) {
                    count++;
                }
                if (count > result) {
                    result = count;
                }
            }
        }
        return result;
    }

    public static int pickingNumbersStream(List<Integer> a) {
        int[] arr = a.stream().mapToInt(i -> i).toArray();
        return Arrays.stream(arr).distinct()
                .map(i -> (int) Arrays.stream(arr).filter(i0 -> i0 == i || i0 == i + 1).count())
                .max().orElse(0);
    }
}

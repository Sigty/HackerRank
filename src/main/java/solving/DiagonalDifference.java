package solving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {

    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> arr1 = new ArrayList<>(Arrays.asList(11, 2, 4));
        arr.add(arr1);
        List<Integer> arr2 = new ArrayList<>(Arrays.asList(4, 5, 6));
        arr.add(arr2);
        List<Integer> arr3 = new ArrayList<>(Arrays.asList(10, 8, -12));
        arr.add(arr3);
        diagonalDifference(arr);
    }

    private static int diagonalDifference(List<List<Integer>> arr) {
        int arrSquare = arr.get(0).size();
        int sumDiagonalFirst = 0;
        int sumDiagonalSecond = 0;
        for (int i = 0; i < arrSquare; i++) {
            sumDiagonalFirst += arr.get(i).get(i);
            System.out.println(sumDiagonalFirst);
            sumDiagonalSecond += arr.get(i).get(arrSquare - i - 1);
        }
        return Math.abs(sumDiagonalFirst - sumDiagonalSecond);
    }
}

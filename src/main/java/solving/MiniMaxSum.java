package solving;

import java.util.Arrays;

public class MiniMaxSum {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        miniMaxSum(arr);
    }

    private static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        long minSum = 0;
        long maxSum = 0;
        if (arr.length > 1) {
            for (int i = 0; i < arr.length - 1; i++)
                minSum += arr[i];
            for (int i = 1; i < arr.length; i++)
                maxSum += arr[i];
        } else {
            minSum = arr[0];
            maxSum = arr[0];
        }
        System.out.println(minSum + " " + maxSum);
    }
}
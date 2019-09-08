package hugeturtle;

import java.util.Arrays;

public class MissingNumberArray {

    public static void main(String[] args) {
        int[] arr = {1};
        int[] arr1 = {1, 2, 3, 4, 5, 7};
        System.out.println(missingNumber(arr));
        System.out.println(missingNumberStream(arr));
        System.out.println(missingNumber(arr1));
        System.out.println(missingNumberStream(arr1));
    }

    public static int missingNumber(int[] arr) {
        int sum = 0;
        for (int el : arr) {
            sum += el;
        }
        return (arr.length + 1) * (arr.length + 2) / 2 - sum;
    }


    public static int missingNumberStream(int[] arr) {
        return ((arr.length + 1) * (arr.length + 2) / 2) - Arrays.stream(arr).sum();
    }
}
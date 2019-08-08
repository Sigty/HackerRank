package solving;

public class PlusMinusZero {

    public static void main(String[] args) {
        int[] arrays = {-4, 3, -9, 0, 4, 1};
        plusMinus(arrays);
    }

    private static void plusMinus(int[] arr) {
        double countPlus = 0.00000;
        double countMinus = 0.00000;
        double countZero = 0.00000;

        for (int i = 0; i < arr.length; i++) {
            countPlus += arr[i] > 0 ? 1 : 0;
            countMinus += arr[i] < 0 ? 1 : 0;
            countZero += arr[i] == 0 ? 1 : 0;
        }
        double resultPlus = countPlus / arr.length;
        double resultMinus = countMinus / arr.length;
        double resultZero = countZero / arr.length;
        System.out.printf("%.6f%n", resultPlus);
        System.out.printf("%.6f%n", resultMinus);
        System.out.printf("%.6f%n", resultZero);
    }
}
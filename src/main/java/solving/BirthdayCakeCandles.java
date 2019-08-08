package solving;

public class BirthdayCakeCandles {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3};
        System.out.println(birthdayCakeCandles(arr));
    }

    private static int birthdayCakeCandles(int[] ar) {
        int max = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            int value = ar[i];
            if (value > max) {
                max = value;
            }
        }
        for (int j = 0; j < ar.length; j++) {
            if (ar[j] == max) {
                count++;
            }
        }
        return count;
    }
}

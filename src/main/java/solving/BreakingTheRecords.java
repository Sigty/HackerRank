package solving;

import java.util.Arrays;

public class BreakingTheRecords {

    public static void main(String[] args) {
        int[] scores = {1, 1, 2, 10, 25, 7, 10, 2, 1};
        System.out.println(Arrays.toString(breakingRecords(scores)));
    }

    private static int[] breakingRecords(int[] scores) {
        int countMax = 0;
        int cointMin = 0;
        int tempMax = scores[0];
        int tempMin = scores[0];
        int[] result = new int[2];
        for (int score : scores) {
            if (tempMax < score) {
                tempMax = score;
                countMax++;
                result[0] = countMax;
            }
            if (tempMin > score) {
                tempMin = score;
                cointMin++;
                result[1] = cointMin;
            }
        }
        return result;
    }
}
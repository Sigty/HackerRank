package solving;

import java.util.Arrays;

public class SequenceEquation {

//    https://www.hackerrank.com/challenges/permutation-equation/problem

    public static void main(String[] args) {
        int[] a1 = {2, 3, 1};
        System.out.println(Arrays.toString(permutationEquation(a1)));
        int[] a2 = {4, 3, 5, 1, 2};
        System.out.println(Arrays.toString(permutationEquation(a2)));
    }

    private static int[] permutationEquation(int[] p) {
        int[] result = new int[p.length];
        for (int i = 1; i <= p.length; i++) {
            for (int j = 0; j < p.length; j++) {
                if (i == p[p[j] - 1]) {
                    result[i - 1] = j + 1;
                }
            }
        }
        return result;
    }
}

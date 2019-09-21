package algorithms.sorting;

import java.util.stream.IntStream;

public class IntrotoTutorialChallenges {

//    https://www.hackerrank.com/challenges/tutorial-intro/problem

    public static void main(String[] args) {
        int[] arr1 = {1, 4, 5, 7, 9, 12};
        System.out.println(introTutorial(7, arr1));
    }

    private static int introTutorial(int V, int[] arr) {
        return IntStream.range(0, arr.length)
                .filter(i -> V == arr[i])
                .findFirst()
                .orElse(-1);
    }
}
package algorithms.implementation;

public class BeautifulTriplets {

//    https://www.hackerrank.com/challenges/beautiful-triplets/problem

    public static void main(String[] args) {
        int[] a1 = {1, 2, 4, 5, 7, 8, 10};
        System.out.println(beautifulTriplets(3, a1));
    }

    private static int beautifulTriplets(int d, int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] == arr[j] - d)) {
                    for (int k = j + 1; k < arr.length; k++) {
                        if (k < arr.length) {
                            if (arr[j] == arr[k] - d) {
                                result++;
                            }
                        }
                    }
                }
            }
        }
        return result;
    }
}

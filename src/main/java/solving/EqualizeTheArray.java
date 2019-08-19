package solving;

public class EqualizeTheArray {

//    https://www.hackerrank.com/challenges/equality-in-a-array/problem

    public static void main(String[] args) {
        int[] arr = {3, 3, 2, 1, 3};
        System.out.println(equalizeArray(arr));
        int[] arr2 = {31, 3, 2, 1, 3};
        System.out.println(equalizeArray(arr2));
        int[] arr3 = {1, 2, 3, 1, 2, 3, 3, 3};
        System.out.println(equalizeArray(arr3));
    }

    private static int equalizeArray(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > result) {
                result = count;
            }
        }
        return arr.length - result;
    }
}

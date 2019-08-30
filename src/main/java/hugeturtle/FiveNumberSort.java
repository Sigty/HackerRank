package hugeturtle;

import java.util.Arrays;

public class FiveNumberSort {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 5, 4, 1, 4, 5, 3, 2, 1, 4, 5, 1, 2, 3, 4, 3};
        System.out.println(Arrays.toString(sort(arr1)));
    }

    public static int[] sort(int[] arr) {
        int cnt0 = 0, cnt1 = 0, cnt2 = 0, cnt3 = 0, cnt4 = 0, cnt5 = 0;
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case 0:
                    cnt0++;
                    break;
                case 1:
                    cnt1++;
                    break;
                case 2:
                    cnt2++;
                    break;
                case 3:
                    cnt3++;
                    break;
                case 4:
                    cnt4++;
                    break;
                case 5:
                    cnt5++;
                    break;
            }
        }
        int j = 0;
        while (cnt0 > 0) {
            arr[j++] = 0;
            cnt0--;
        }

        while (cnt1 > 0) {
            arr[j++] = 1;
            cnt1--;
        }
        while (cnt2 > 0) {
            arr[j++] = 2;
            cnt2--;
        }
        while (cnt3 > 0) {
            arr[j++] = 3;
            cnt3--;
        }
        while (cnt4 > 0) {
            arr[j++] = 4;
            cnt4--;
        }
        while (cnt5 > 0) {
            arr[j++] = 5;
            cnt5--;
        }
        return arr;
    }
}
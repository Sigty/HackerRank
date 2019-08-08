package solving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MigratoryBirds {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 4, 4, 4, 5, 3));
        System.out.println(migratoryBirds(arr));
    }

    private static int migratoryBirds(List<Integer> arr) {
        int result = 0;
        int temp = 0;
        for (int i = 1; i <= 5; i++) {
            int count = 0;
            for (Integer integer : arr) {
                if (integer == i) {
                    count++;
                }
            }
            if (count > temp) {
                temp = count;
                result = i;
            }
        }
        return result;
    }
}

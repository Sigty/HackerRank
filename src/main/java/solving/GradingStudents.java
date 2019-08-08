package solving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradingStudents {

    public static void main(String[] args) {
        List<Integer> exmp = new ArrayList<>(Arrays.asList(73, 67, 38, 33));
        System.out.println(gradingStudents(exmp));
    }

    private static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> result = new ArrayList<>();
        for (int value : grades) {
            int res = value % 10;
            if (res > 5 && value > 35) {
                value = (10 - res < 3) ? value + (10 - res) : value;
                result.add(value);
            } else if (value > 35) {
                value = (5 - res < 3) ? value + (5 - res) : value;
                result.add(value);
            } else {
                result.add(value);
            }
        }
        return result;
    }
}

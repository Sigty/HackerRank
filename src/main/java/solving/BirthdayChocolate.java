package solving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BirthdayChocolate {

    public static void main(String[] args) {
        List<Integer> s = new ArrayList<>(Arrays.asList(1, 2, 1, 3, 2));
        System.out.println(birthday(s, 3, 2));
        List<Integer> s1 = new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1, 1));
        System.out.println(birthday(s, 3, 2));
        List<Integer> s2 = new ArrayList<>(Arrays.asList(4, 5));
        System.out.println(birthday(s, 4, 1));
    }

    private static int birthday(List<Integer> s, int d, int m) {
        int count = 0;
        while (s.size() >= m) {
            count += s.stream().limit(m).mapToInt(Integer::intValue).sum() == d ? 1 : 0;
            s.remove(0);
        }
        return count;
    }
}

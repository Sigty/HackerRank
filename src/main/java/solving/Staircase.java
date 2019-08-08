package solving;

import java.util.Collections;

public class Staircase {

    public static void main(String[] args) {
        staircase(4);
    }

    private static void staircase(int n) {
        String stair = "#";
        String blank = " ";
        for (int i = 1; i <= n; i++) {
            System.out.print(String.join("", Collections.nCopies(n - i, blank)));
            System.out.println(String.join("", Collections.nCopies(i, stair)));
        }
    }
}

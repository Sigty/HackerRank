package solving;

public class JumpingOnTheClouds {

    //    https://www.hackerrank.com/challenges/jumping-on-the-clouds-revisited/problem
    public static void main(String[] args) {
        int[] a1 = {0, 0, 1, 0, 0, 1, 1, 0};
        System.out.println(jumpingOnClouds(a1, 2));
    }

    private static int jumpingOnClouds(int[] c, int k) {
        int e = 100;
        int clouds = 0;
        do {
            clouds = (clouds + k) % c.length;
            if (c[clouds] == 1) {
                e -= 2;
            }
            e--;
        } while (clouds != 0);
        return e;
    }
}

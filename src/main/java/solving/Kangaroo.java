package solving;

public class Kangaroo {

    public static void main(String[] args) {
        System.out.println(kangaroo(0, 3, 4, 2));
        System.out.println(kangaroo(0, 2, 5, 4));
    }

    private static String kangaroo(int x1, int v1, int x2, int v2) {
        String result = "NO";
        if (x2 >= x1) {
            for (int i = 0; i < 10000; i++) {
                result = (x1 + (v1 * i) == x2 + (v2 * i)) ? "YES" : "NO";
                if (result.equals("YES")) {
                    break;
                }
            }
        }
        return result;
    }
}
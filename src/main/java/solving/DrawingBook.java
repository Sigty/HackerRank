package solving;

public class DrawingBook {

//    https://www.hackerrank.com/challenges/drawing-book/problem

    public static void main(String[] args) {
        System.out.println(pageCount(6, 2));
        System.out.println(pageCount(6, 5));
    }

    private static int pageCount(int n, int p) {
        return ((n + 1 - n % 2 - 2 * p) > 0) ? p / 2 : (n + 1 - n % 2 - p) / 2;
    }
}


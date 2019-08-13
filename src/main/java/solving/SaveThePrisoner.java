package solving;

public class SaveThePrisoner {

//    https://www.hackerrank.com/challenges/save-the-prisoner/problem

    public static void main(String[] args) {
        System.out.println(saveThePrisoner(5, 2, 1));
        System.out.println(saveThePrisoner(5, 2, 2));
        System.out.println(saveThePrisoner(7, 19, 2));
        System.out.println(saveThePrisoner(3, 7, 3));
    }

    private static int saveThePrisoner(int n, int m, int s) {
        return ((m + s - 1) % n != 0) ? ((m + s - 1) % n) : n;
    }
}
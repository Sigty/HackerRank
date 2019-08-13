package solving;

public class UtopianTree {

    //    https://www.hackerrank.com/challenges/utopian-tree/problem

    public static void main(String[] args) {
        System.out.println(utopianTree(0));
        System.out.println(utopianTree(1));
        System.out.println(utopianTree(2));
        System.out.println(utopianTree(3));
        System.out.println(utopianTree(4));
        System.out.println(utopianTree(5));
        System.out.println(utopianTree(6));
        System.out.println(utopianTree(7));
        System.out.println(utopianTree(8));
        System.out.println(utopianTree(9));
    }

    static int utopianTree(int n) {
        int resultLength = 1;
        for (int i = 0; i < n; i++) {
            resultLength += (i % 2 == 0) ? resultLength : 1;
        }
        return resultLength;
    }
}
public class AngryProfessor {

//    https://www.hackerrank.com/challenges/angry-professor/problem

    public static void main(String[] args) {
        int[] a = {0, -1, 2, 1};
        System.out.println(angryProfessor(2, a));
        int[] a1 = {-1, -3, 4, 2};
        System.out.println(angryProfessor(3, a1));
    }

    private static String angryProfessor(int k, int[] a) {
        int students = 0;
        for (int i = 0; i < a.length; i++) {
            students += (a[i] < 1) ? 1 : 0;
        }
        return (students < k) ? "YES" : "NO";
    }
}
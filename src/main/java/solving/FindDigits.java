package solving;

public class FindDigits {

//    https://www.hackerrank.com/challenges/find-digits/problem

    public static void main(String[] args) {
        System.out.println(findDigits(12));
        System.out.println(findDigits(1024));
    }

    private static int findDigits(int n) {
        int count = 0;
        char[] nTemp = String.valueOf(n).toCharArray();
        for (char i : nTemp) {
            int temp = Integer.parseInt(String.valueOf(i));
            if (temp > 0 && (n % temp) == 0) {
                count++;
            }
        }
        return count;
    }
}

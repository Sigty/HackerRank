package solving;

public class CountingValleys {

//    https://www.hackerrank.com/challenges/counting-valleys/problem

    public static void main(String[] args) {
        System.out.println(countingValleys(8, "UDDDUDUU"));
        System.out.println(countingValleys(8, "UDDDUDUUDDUU"));
    }

    public static int countingValleys(int n, String s) {
        int countValleys = 0;
        char[] arrS = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < arrS.length; i++) {
            int addNumber = (arrS[i] == 'U') ? ++sum : --sum;
            if (sum == 0 && arrS[i] == 'U') {
                countValleys++;
            }
        }
        return countValleys;
    }
}

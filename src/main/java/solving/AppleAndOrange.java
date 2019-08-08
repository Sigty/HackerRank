package solving;

public class AppleAndOrange {

    public static void main(String[] args) {
        int[] apples = {-3, -2, 0, 1, 3};
        int[] oranges = {-7, -5, 0, 5, 7};
        countApplesAndOranges(5, 10, 3, 10, apples, oranges);
    }

    private static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int countApple = 0;
        int countOrange = 0;
        int startRegionApple = s - a;
        int endRegionApple = t - a;
        int startRegionOrange = s - b;
        int endRegionOrange = t - b;
        for (int apple : apples) {
            if (apple >= startRegionApple && apple <= endRegionApple) {
                countApple++;
            }
        }
        for (int orange : oranges) {
            if (orange >= startRegionOrange && orange <= endRegionOrange) {
                countOrange++;
            }
        }
        System.out.println(countApple);
        System.out.println(countOrange);
    }
}
package solving;

public class TheHurdleRace {

    //    https://www.hackerrank.com/challenges/the-hurdle-race/
    public static void main(String[] args) {
        int[] h0 = {1, 6, 3, 5, 2};
        System.out.println(hurdleRace(4, h0));
    }

    private static int hurdleRace(int k, int[] height) {
        int result = 0;
        for (int i = 0; i < height.length; i++) {
            int temp;
            if (height[i] - k > 0) {
                temp = height[i] - k;
                if (temp > result) {
                    result = temp;
                }
            }
        }
        return result;
    }
}
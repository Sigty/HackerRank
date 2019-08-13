package solving;

public class ViralAdvertising {

//    https://www.hackerrank.com/challenges/strange-advertising/problem

    public static void main(String[] args) {
        System.out.println(viralAdvertising(10));
        System.out.println(viralAdvertising(5));
        System.out.println(viralAdvertising(1));
    }

    static int viralAdvertising(int n) {
        int liked;
        int shared = 5;
        int cumulative = 0;
        for (int i = 0; i < n; i++) {
            liked = shared / 2;
            cumulative += liked;
            shared = liked * 3;
        }
        return cumulative;
    }
}
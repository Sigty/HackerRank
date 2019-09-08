package jnetworks;

public class RoundedCounter {

    public static void main(String[] args) {
        roundCounter(5);
    }

    public static void roundCounter(int n) {
        for (int i = 0; ; ) {
            System.out.println((i % n) + 1);
            i++;
        }
    }
}
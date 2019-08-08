package solving;

public class CatsAndAMouse {

    //    https://www.hackerrank.com/challenges/cats-and-a-mouse/problem

    public static void main(String[] args) {
        System.out.println(catAndMouse(0, 3, 2));
        System.out.println(catAndMouse(0, 3, 1));
        System.out.println(catAndMouse(0, 3, 4));
        System.out.println(catAndMouse(1, 3, 2));
    }

    public static String catAndMouse(int x, int y, int z) {
        int rangeMouseToX = Math.abs(z - x);
        int rangeMouseToY = Math.abs(z - y);
        if (rangeMouseToX == rangeMouseToY) {
            return "Mouse C";
        } else if (rangeMouseToX < rangeMouseToY) {
            return "Cat A";
        } else {
            return "Cat B";
        }
    }
}
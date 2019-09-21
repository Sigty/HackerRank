package algorithms.strings;

public class CamelCase {

//    https://www.hackerrank.com/challenges/camelcase/problem

    public static void main(String[] args) {
        System.out.println(camelcase("saveChangesInTheEditor"));
    }

    private static int camelcase(String s) {
        return s.split("(?<=[a-z])(?=[A-Z])|(?<=[A-Z])(?=[A-Z][a-z])").length;
    }
}

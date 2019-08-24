package algorithms.implementation;

import java.util.Arrays;

//https://www.hackerrank.com/challenges/repeated-string/problem
public class RepeatedString {

    public static void main(String[] args) {
        System.out.println(repeatedString("aba", 10));
        System.out.println(repeatedString("ceebbcb", 817723));
    }

    private static long repeatedString(String s, long n) {
        final String targetChar = "a";
        long count = Arrays.stream(s.split("")).filter(ch -> ch.equals(targetChar)).count();
        long l = n / s.length();
        long result = count * l;
        long os = n % s.length();
        if (os != 0) {
            String temp = s.substring(0, (int) os);
            long countTemp = Arrays.stream(temp.split("")).filter(ch -> ch.equals(targetChar)).count();
            result += countTemp;
        }
        return result;
    }
}

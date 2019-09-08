package jnetworks;

import java.util.stream.IntStream;

public class FizzBuzz {

    public static void main(String[] args) {
        solutionOne(30);
        solutionTwo(30);
        solutionThree(30);
    }

    public static void solutionOne(int n) {
        for (int i = 1; i <= n; ++i) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else
                System.out.println(i);
        }
    }

    public static void solutionTwo(int n) {
        IntStream.rangeClosed(1, n).forEach(
                i -> System.out.format("%s%s%n",
                        (i % 3 == 0 ? "Fizz" : ""),
                        (i % 5 == 0 ? "Buzz" : (i % 3 == 0 ? "" : i))
                )
        );
    }

    public static void solutionThree(int n) {
        IntStream.rangeClosed(1, n).mapToObj(
                i -> i % 3 == 0 ?
                        (i % 5 == 0 ? "FizzBuzz" : "Fizz") :
                        (i % 5 == 0 ? "Buzz" : i))
                .forEach(System.out::println);
    }
}
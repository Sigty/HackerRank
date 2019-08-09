package test;

import java.util.HashSet;
import java.util.Set;

public class BracketBad {

    public static void main(String[] args) {
        System.out.println(validate(""));
        System.out.println(validate("{"));
        System.out.println(validate("}"));
        System.out.println(validate("}{}"));
        System.out.println(validate("{}}{}}"));
        System.out.println(validate("{}x}x}"));
        System.out.println(validate("{a}{b{}c}}"));
    }

    public static Set<String> validate(String input) {
        Set<String> result = new HashSet<>();
        recursion(input, result, 0, 0, '{', '}');
        return result;
    }

    public static void recursion(String input, Set<String> result, int iNumber, int jNumber, char firstSym, char secondSym) {

        int count = 0;
        for (int step = 0, i = iNumber; i < input.length(); i++) {
            if (input.charAt(i) == firstSym) {
                step++;
            }
            if (input.charAt(i) == secondSym) {
                step--;
            }
            if (step < 0) {
                for (int j = jNumber; j <= i; j++) {
                    if (input.charAt(j) == secondSym && (j == jNumber || input.charAt(j - 1) != secondSym)) {
                        recursion(input.substring(0, j) + input.substring(j + 1), result, i, j, firstSym, secondSym);
                    }
                }
                return;
            }
            count = step;
        }
        if (firstSym == '{' && count == 0 && secondSym == '}') {
            result.add(input);
            return;
        }
    }
}
package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.stream.Collectors;

public class ValidParentheses {

//    https://leetcode.com/problems/valid-parentheses/

    public static void main(String[] args) {

        System.out.println(isValid("{}"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("([)]"));
        System.out.println(isValid("{[]}"));
    }

    public static boolean isValid(String s) {
        Map<Character, Character> bracket = new HashMap<>();
        bracket.put('(', ')');
        bracket.put('[', ']');
        bracket.put('{', '}');
        Stack<Character> stackChar = new Stack<>();
        for (char c : s.toCharArray()) {
            if (bracket.containsKey(c)) {
                stackChar.push(bracket.get(c));
            } else if (bracket.containsValue(c)) {
                if (stackChar.isEmpty() || stackChar.pop() != c) {
                    return false;
                }
            }
        }
        return stackChar.isEmpty();
    }

    public boolean isValid2(String s) {
        char[] stack = new char[s.length()];
        int idx = 0;
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            if (x == '[' || x == '{' || x == '(') {
                stack[idx++] = x;
            } else if (x == ']' || x == '}' || x == ')') {
                if (idx == 0) return false;
                char y = stack[idx - 1];
                if ((x == ']' && y == '[') || (x == '}' && y == '{') || (x == ')' && y == '(')) {
                    stack[--idx] = 0;
                } else return false;
            }
        }
        return idx == 0;
    }

    public static boolean isValid3(String s) {
        String[] split = s.split("");
        List<String> array = Arrays.stream(split).filter(x -> x.equals("{") || x.equals("}")).collect(Collectors.toList());
        List<String> array1 = Arrays.stream(split).filter(x -> x.equals("[") || x.equals("]")).collect(Collectors.toList());
        List<String> array2 = Arrays.stream(split).filter(x -> x.equals("(") || x.equals(")")).collect(Collectors.toList());
        boolean a = checkBracket(array);
        boolean b = checkBracket(array1);
        boolean c = checkBracket(array2);
        return (a == true && b == true && c == true) ? true : false;
    }

    private static boolean isValid4(String expression) {

        if (expression == null || expression.isEmpty()) {
            return true;
        }

        Stack<Character> stack = new Stack<>();

        for (char c : expression.toCharArray()) {
            switch (c) {
                case '{':
                case '(':
                case '[':
                    stack.push(c);
                    break;
                case '}':
                    if (!stack.isEmpty()) {
                        if (stack.peek() != '{')
                            return false;
                        stack.pop();
                    } else {
                        return false;
                    }
                    break;

                case ')':
                    if (!stack.isEmpty()) {
                        if (stack.peek() != '(')
                            return false;
                        stack.pop();
                    } else {
                        return false;
                    }
                    break;

                case ']':
                    if (!stack.isEmpty()) {
                        if (stack.peek() != '[')
                            return false;
                        stack.pop();
                    } else {
                        return false;
                    }
                    break;

                default:
                    continue;
            }
        }
        return stack.isEmpty();
    }


    public static boolean checkBracket(List<String> array) {
        int count = 0;
        for (String i : array) {
            if (i.equals("{") || i.equals("[") || i.equals("(")) {
                count++;
            }
            if (i.equals("}") || i.equals("]") || i.equals(")")) {
                count--;
            }
        }
        return count == 0 ? true : false;
    }
}

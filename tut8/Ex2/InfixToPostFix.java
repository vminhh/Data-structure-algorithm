package tut8.Ex2;

import java.util.*;

public class InfixToPostfix {
    public static void main(String[] args) {
        String test = "(a+b)*(c^d/e)-(f*g^h)";
        System.out.println("Infix: " + test);
        System.out.println("Postfix: " + converter(test));
    }

    public static String converter(String epxr) {
        StringBuilder res = new StringBuilder();
        Stack<Character> S = new Stack<>();

        for (int i = 0; i < epxr.length(); i++) {
            char c = epxr.charAt(i);

            // add in output if is operand
            if (Character.isLetterOrDigit(c)) {
                res.append(c);
            }

            // push in stack if '('
            else if (c == '(') {
                S.push(c);
            }

            // pop output from stack if ')'
            // util see '('
            else if (c == ')') {
                while (!S.isEmpty() && S.peek() != '(') {
                    res.append(S.pop());
                }

                if (!S.isEmpty() && S.peek() != '(')
                    return "Invalid Expression";
                else
                    S.pop(); // pop '('
            }

            else {
                // compare precedence operand to operand on top in stack
                while (!S.isEmpty() && pre(c) <= pre(S.peek())) {
                    res.append(S.pop());
                }

                S.push(c);
            }
        }
        // pop all the operators
        while (!S.isEmpty()) {
            res.append(S.pop());
        }

        return res.toString();
    }

    private static int pre(char c) {
        switch (c) {
            case '+':
            case '-':
                return 2;
            case '*':
            case '/':
                return 3;
            case '^':
                return 4;
            default:
                return 1;
        }
    }

    // chac vay la xong roi nhi
    // 7.10PM 26/3/2024 by Minh
}

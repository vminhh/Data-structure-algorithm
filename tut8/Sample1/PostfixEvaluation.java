package tut8.Sample1;

public class PostfixEvaluation {
    public static void main(String[] args) {
        String test = "25-32*4/+"; // (2-5) + (3*2/4)
        System.out.println("Postfix valuate " + test + " is "+ evaluatePostfix(test));
    }

    public static int evaluatePostfix(String expr) {
        ArrayStack stack = new ArrayStack(expr.length());

        for (int i = 0; i < expr.length(); i++) {
            char c = expr.charAt(i);
            // if it is an operand, push in stack
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else {
                int operand1 = stack.pop();
                int operand2 = stack.pop();

                switch (c) {
                    case '+':
                        stack.push(operand2 + operand1);
                        break;
                    case '-':
                        stack.push(operand2 - operand1);
                        break;
                    case '*':
                        stack.push(operand2 * operand1);
                        break;
                    case '/':
                        stack.push(operand2 / operand1);
                        break;
                    default:
                        break;
                }
            }
        }
        return stack.pop();
    }
}

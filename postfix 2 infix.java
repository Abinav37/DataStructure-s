import java.util.Stack;
import java.util.Scanner;

class Main {
    public static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

    public static String postfixToInfix(String postfix) {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < postfix.length(); i++) {
            char c = postfix.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                stack.push(Character.toString(c));
            } else if (isOperator(c)) {
                String operand2 = stack.pop();
                String operand1 = stack.pop();
                String expr = "(" + operand1 + c + operand2 + ")";
                stack.push(expr);
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the postfix expression:");
        String postfix = sc.nextLine();

        String result = postfixToInfix(postfix);
        System.out.println("The infix expression is:");
        System.out.println(result);
    }
}

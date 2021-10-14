import java.util.Scanner;
import java.util.Stack;

public class Postfix {
    private Stack<Double> stack;
    private String expression;

    // call setExpression with an empty String
    public Postfix() {
        setExpression("");
    }

    // call setExpression with exp
    public Postfix(String exp) {
        setExpression(exp);
    }

    // initialize stack and expression here
    public void setExpression(String exp) {
        stack = new Stack<>();
        expression = exp;
    }

    // perform the given operation (+ - * /) between one and two
    public double calc(double one, double two, char op) {
        return switch (op) {
            case '+' -> one + two;
            case '-' -> one - two;
            case '*' -> one * two;
            case '/' -> one / two;
            default -> 0.0;
        };
    }

    // read each character from expression
    // determine if the character is a digit or an operator
    // solve the expression
    public double solve() {
        Scanner scan = new Scanner(expression);

        while (scan.hasNext()) {
            if (scan.hasNextDouble()) {
                stack.push(scan.nextDouble());
            } else {
                double dbl = stack.pop();
                stack.push(calc(stack.pop(), dbl, scan.next().charAt(0)));
            }
        }

        return stack.peek();
    }

    @Override
    public String toString() {
        return expression + " = " + stack.pop();
    }
}
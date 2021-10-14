import static java.lang.System.out;

public class PostfixRunner {
    public static void main(String[] args) {
        Postfix test = new Postfix("2 7 + 1 2 + +");
        test.solve();
        out.println(test);

        test.setExpression("1 2 3 4 + + +");
        test.solve();
        out.println(test);

        test.setExpression("9 3 * 8 / 4 +");
        test.solve();
        out.println(test);

        test.setExpression("3 3 + 7 * 9 2 / +");
        test.solve();
        out.println(test);

        test.setExpression("9 3 / 2 * 7 9 * + 4 -");
        test.solve();
        out.println(test);

        test.setExpression("5 5 + 2 * 4 / 9 +");
        test.solve();
        out.println(test);
    }
}
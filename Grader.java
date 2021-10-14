/*****************************************
 *  DO NOT DELETE OR CHANGE THIS FILE!!! *
 *****************************************/

import static java.lang.System.out;

public class Grader {
    public static void main(String[] args) {
        Postfix test = new Postfix();
        if (args[0].equals("1")) {
            test.setExpression("2 7 + 1 2 + +");
            test.solve();
            out.println(test);
        } else if (args[0].equals("2")) {
            test.setExpression("1 2 3 4 + + +");
            test.solve();
            out.println(test);
        } else if (args[0].equals("3")) {
            test.setExpression("9 3 * 8 / 4 +");
            test.solve();
            out.println(test);
        } else if (args[0].equals("4")) {
            test.setExpression("3 3 + 7 * 9 2 / +");
            test.solve();
            out.println(test);
        } else if (args[0].equals("5")) {
            test.setExpression("9 3 / 2 * 7 9 * + 4 -");
            test.solve();
            out.println(test);
        } else if (args[0].equals("6")) {
            test.setExpression("5 5 + 2 * 4 / 9 +");
            test.solve();
            out.println(test);
        }
    }
}
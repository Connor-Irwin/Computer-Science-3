/****************************************
 * DO NOT DELETE OR CHANGE THIS FILE!!! *
 ****************************************/

import static java.lang.System.out;

public class Grader {
    public static void main(String[] args) {
        StackTest test = new StackTest();
        if (args[0].equals("1")) {
            test.setStack("a b c d e f g h i");
            out.println(test);
            test.popEmAll();
        } else if (args[0].equals("2")) {
            test.setStack("1 2 3 4 5 6 7 8 9 10");
            out.println(test);
            test.popEmAll();
        } else if (args[0].equals("3")) {
            test.setStack("# $ % ^ * ( ) ) _");
            out.println(test);
            test.popEmAll();
        } else {
            out.println(test);
            test.popEmAll();
        }
    }
}

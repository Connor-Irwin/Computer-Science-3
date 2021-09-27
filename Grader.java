/****************************************
 * DO NOT DELETE OR CHANGE THIS FILE!!! *
 ****************************************/

import static java.lang.System.out;

public class Grader {
    public static void main(String[] args) {
        if (args.length == 0) {
            out.println(new Histogram());
        } else {
            out.println(new Histogram(args[0]));
        }
    }
}

/*****************************************
 *  DO NOT DELETE OR CHANGE THIS FILE!!! *
 *****************************************/

import static java.lang.System.out;

public class Grader {
    public static void main(String[] args) {
        PalinList test = new PalinList();
        if (args[0].equals("1")) {
            test.setList("one two three two one");
            out.println(test.isPalin() ? "y" : "n");
        } else if (args[0].equals("2")) {
            test.setList("1 2 3 4 5 one two three four five");
            out.println(test.isPalin() ? "y" : "n");
        } else if (args[0].equals("3")) {
            test.setList("a b c d e f g x y z g f h");
            out.println(test.isPalin() ? "y" : "n");
        } else if (args[0].equals("4")) {
            test.setList("racecar is racecar");
            out.println(test.isPalin() ? "y" : "n");
        } else if (args[0].equals("5")) {
            test.setList("1 2 3 a b c c b a 3 2 1");
            out.println(test.isPalin() ? "y" : "n");
        } else if (args[0].equals("6")) {
            test.setList("chicken is a chicken");
            out.println(test.isPalin() ? "y" : "n");
        }
    }
}
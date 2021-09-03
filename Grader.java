/****************************************
 * DO NOT DELETE OR CHANGE THIS FILE!!! *
 ****************************************/
public class Grader {
    public static void main(String[] args) {
        IteratorReplacer test = new IteratorReplacer();
        test.setEmAll(args[0], args[1], args[2]);
        test.replace();
        System.out.println(test);
    }
}

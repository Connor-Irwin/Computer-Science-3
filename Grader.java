/****************************************
 * DO NOT DELETE OR CHANGE THIS FILE!!! *
 ****************************************/
public class Grader {
    public static void main(String[] args) {
        if (args.length == 2) {
            MathSet test = new MathSet(args[0], args[1]);
            System.out.println(test.union());
            System.out.println(test.intersection());
            System.out.println(test.differenceAMinusB());
            System.out.println(test.differenceBMinusA());
            System.out.println(test.symmetricDifference());
        }
    }
}

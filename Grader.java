/****************************************
 * DO NOT DELETE OR CHANGE THIS FILE!!! *
 ****************************************/
public class Grader {
    public static void main(String[] args) {
        if (args.length == 6) {
            SpanishToEnglish test = new SpanishToEnglish();
            test.putEntry(args[1]);
            test.putEntry(args[2]);
            test.putEntry(args[3]);
            test.putEntry(args[4]);
            test.putEntry(args[5]);
            if (args[0].equals("1")) {
                System.out.println(test);
            } else if (args[0].equals("2")) {
                System.out.println(test.translate("yo quiero una ordenador virus"));
            }
        }
    }
}

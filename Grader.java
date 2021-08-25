/****************************************
 * DO NOT DELETE OR CHANGE THIS FILE!!! *
 ****************************************/
import static java.lang.System.*;

public class Grader {
    public static void main(String[] args) {
        if (args.length != 5) {
            return;
        }
        Skeleton mon1 = new Skeleton(args[0], Integer.parseInt(args[1]));
        Skeleton mon2 = new Skeleton(args[2], Integer.parseInt(args[3]));
        if (args[4].equals("toString")) {
            out.print(mon1 + " " + mon2);
        }
        if (args[4].equals("getHowBig")) {
            out.print(mon1.getHowBig() == Integer.parseInt(args[1]));
        }
        if (args[4].equals("getName")) {
            out.print(mon2.getName().equals(args[2]));
        }
        if (args[4].equals("isBigger")) {
            out.print(mon1.isBigger(mon2));
        }
        if (args[4].equals("isSmaller")) {
            out.print(mon1.isSmaller(mon2));
        }
        if (args[4].equals("namesTheSame")) {
            out.print(mon1.namesTheSame(mon2));
        }
    }
}

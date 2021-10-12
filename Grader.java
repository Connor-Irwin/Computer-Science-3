/****************************************
 * DO NOT DELETE OR CHANGE THIS FILE!!! *
 ****************************************/

import static java.lang.System.out;

public class Grader {
    public static void main(String[] args) {
        Part p0 = new Part("Radiator 23102 Dodge Ram 2021");
        Part p1 = new Part("Air Filter 98765 Chevy Silverado 2019");
        Part p2 = new Part("Wiper Blades 12321 Chevy Camaro 2009");
        Part p3 = new Part("Air Filter 99653 Chevy Silverado 2020");
        PartList list = new PartList("partinfo.dat");
        if (args[0].equals("Part0")) {
            out.println(p0);
        } else if (args[0].equals("Part1")) {
            out.println(p1);
        } else if (args[0].equals("Part2")) {
            out.println("" + (p2.compareTo(p3) < 0) + (p1.compareTo(p3) < 0));
        } else if (args[0].equals("PartList")) {
            out.println(list);
        }
    }
}

/****************************************
 * DO NOT DELETE OR CHANGE THIS FILE!!! *
 ****************************************/

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.out;

public class Grader {
    public static void main(String[] args) {
        if (args.length != 1) {
            return;
        }
        try {
            Scanner in = new Scanner(new File("relatives.dat"));
            Relatives test = new Relatives();
            int num = in.nextInt();
            in.nextLine();
            for (int i = 0; i < num; i++) {
                test.setPersonRelative(in.nextLine());
            }
            out.println(test.getRelatives(args[0]));
        } catch (IOException e) {
            out.println("Error - could not read file `relatives.dat`");
        }
    }
}

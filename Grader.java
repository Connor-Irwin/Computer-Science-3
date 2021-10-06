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
            Scanner in = new Scanner(new File("acro.dat"));
            Acronyms test = new Acronyms();
            int num = in.nextInt();
            in.nextLine();
            for (int i = 0; i < num; i++) {
                test.putEntry(in.nextLine());
            }
            int count = 1;
            while (in.hasNext()) {
                String line = in.nextLine();
                if (count == Integer.parseInt(args[0])) {
                    out.println(test.convert(line));
                }
                count++;
            }
        } catch (IOException e) {
            out.println("Error - could not read file `acro.dat`");
        }
    }
}

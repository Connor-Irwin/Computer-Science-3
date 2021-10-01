import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.out;

public class RelativesRunner {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new File("relatives.dat"));

            Relatives test = new Relatives();

            int num = in.nextInt();
            in.nextLine();
            for (int i = 0; i < num; i++) {
                test.setPersonRelative(in.nextLine());
            }

            out.println(test);

            String person = in.next();
            out.println(person + " is related to " + test.getRelatives(person));
        } catch (IOException e) {
            out.println("Oh nos! I cannot open that silly file!");
        }
    }
}

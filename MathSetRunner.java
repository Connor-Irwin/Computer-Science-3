import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.out;

public class MathSetRunner {
    public static void main(String[] args) {
        try {
            //throw new IOException(); // Delete this line!!!

            // Create a Scanner to read from the data file "mathset.dat"
            // While there is still data to read from the file:
            //     Read one line to use for Set one
            //     Read the next line to use for Set two
            //     Create a MathSet object
            //     Print output formatted like the examples given in the assignment

            Scanner in = new Scanner(new File("mathset.dat"));

            while (in.hasNext()) {
                String o = in.nextLine();
                String t = in.nextLine();

                MathSet mat = new MathSet(o, t);

                out.println(mat);
                out.println("union - " + mat.union());
                out.println("intersection - " + mat.intersection());
                out.println("difference A-B - " + mat.differenceAMinusB());
                out.println("difference B-A - " + mat.differenceBMinusA());
                out.println("symmetric difference - " + mat.symmetricDifference());

                if (in.hasNextInt()) {
                    out.println("\n");
                }
            }

        } catch (IOException e) {
            out.println("Could not open file: mathset.dat");
        } finally {
            out.println("Done.");
        }
    }
}

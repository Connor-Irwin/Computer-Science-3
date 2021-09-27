import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.System.out;

public class HistoRunner {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("histogram.dat"));
            Histogram hist = new Histogram();

            while (input.hasNext()) {
                hist.setSentence(input.nextLine());

                out.print(hist);
            }
        } catch (FileNotFoundException e) {
            out.println("Error opening file:\n" + e);
        }
    }
}

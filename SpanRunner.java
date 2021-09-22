import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.out;

public class SpanRunner {
    public static void main(String[] args) {
        try {
            // Create a Scanner to read from `spantoeng.dat`
            Scanner input = new Scanner(new File("spantoeng.dat"));

            // Create a SpanishToEnglish object
            SpanishToEnglish ste = new SpanishToEnglish();

            // Read an integer from the file and save to an int variable.
            // This is the number of entries contained in the file.
            // Note: you need to call nextLine() after using Scanner's nextInt() method!
            int wordCount = input.nextInt();
            input.nextLine();

            // Put each entry into the map, using `putEntry()`.
            for (int i = 0; i < wordCount; i++) {
                ste.putEntry(input.nextLine());
            }

            out.println("\n====\tMAP CONTENTS\t====\n\n");

            // Print the SpanishToEnglish object
            out.println(ste);

            out.println("\n\n\n====\tREAD Lines\t====\n\n");
            // Read the rest of the lines in `spantoeng.dat`
            // For each line, call `translate()`
            while (input.hasNext()) {
                String line = input.nextLine();
                out.println(ste.translate(line));
            }

        } catch (IOException e) {
            out.println("Oops! I can't open that file for some reason.");
        }
    }
}

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.out;

public class AcroRunner {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("acro.dat"));

            Acronyms test = new Acronyms();

            int num = file.nextInt();
            file.nextLine();
            for (int i = 0; i < num; i++) {
                test.putEntry(file.nextLine());
            }

            out.println("\n====\tMAP CONTENTS\t====\n\n");
            out.println(test + "\n\n");

            out.println("\n====\tREAD LINES\t====\n\n");
            while (file.hasNext()) {
                out.println(test.convert(file.nextLine()));
            }
        } catch (IOException e) {
            out.println("Sorry, the file cannot be opened at this time.");
        }
    }
}

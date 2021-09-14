import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class DupRunner {
    public static void main(String[] args) {
        // Add tests
        Scanner input = new Scanner(in);
        String words = input.nextLine();

        out.println("Original List: " + words);
        out.println("Uniques: " + UniquesDupes.getUniques(words));
        out.println("Dupes: " + UniquesDupes.getDupes(words));
    }
}

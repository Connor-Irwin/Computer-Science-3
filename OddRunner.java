import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class OddRunner {
    public static void main(String[] args) {
        try {
            // Create a Scanner to read input from file
            // All test cases can go here
            Scanner in = new Scanner(new File("oddeven.dat"));

            while (in.hasNext()) {
                OddEvenSets oes = new OddEvenSets(in.nextLine());
                System.out.println(oes + "\n");
            }
        } catch (IOException e) {
            System.out.println("Could not open file.");
        } finally {
            System.out.println("Done.");
        }
    }
}

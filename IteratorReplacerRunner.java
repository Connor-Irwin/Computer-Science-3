import static java.lang.System.*;
import java.util.Scanner;

public class IteratorReplacerRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);

        String line = input.nextLine();
        String rem = input.nextLine();
        String rep = input.nextLine();

        IteratorReplacer ir = new IteratorReplacer();
        ir.setEmAll(line, rem, rep);
        ir.replace();
        out.println(ir);
    }
}

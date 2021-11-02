import static java.lang.System.out;

public class PalinListRunner {
    public static void main(String[] args) {
        PalinList test = new PalinList();

        String[] testCases = {
                "one two three two one",
                "1 2 3 4 5 one two three four five",
                "a b c d e f g x y z g f h",
                "racecar is racecar",
                "1 2 3 a b c c b a 3 2 1",
                "chicken is a chicken"
        };

        for (String testCase : testCases) {
            test.setList(testCase);
            out.print(test + " ");
            if (test.isPalin()) {
                out.println("is a palinlist.\n");
            } else {
                out.println("is not a palinlist.\n");
            }
        }
    }
}
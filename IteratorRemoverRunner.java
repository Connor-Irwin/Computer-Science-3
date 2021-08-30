/**
 * Write your own tests in main
 */
public class IteratorRemoverRunner {
    public static void main(String[] args) {
        // add test cases
        IteratorRemover test = new IteratorRemover();
        test.setTest("a b c a b c a", "a");
        test.remove();
        System.out.println(test);
    }
}

import java.util.Scanner;

public class PQTesterRunner {
    public static void main(String[] args) {
        // one two three four five six seven
        // 1 2 3 4 5 one two three four five
        // a p h j e f m c i d k l g n o b

        PQTester test = new PQTester();
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a list of Strings: ");
        String list = kb.nextLine();
        test.setPQ(list);
        System.out.println(test);
        System.out.println(test.getMin());
        System.out.println(test.getNaturalOrder() + "\n");
    }
}
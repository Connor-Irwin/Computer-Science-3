import static java.lang.System.out;

public class StackTestRunner {
	public static void main(String[] args) {
		StackTest test = new StackTest("a b c d e f g h i");
		out.println(test);
		test.popEmAll();
		out.println("\n\n");

		test.setStack("1 2 3 4 5 6 7 8 9 10");
		out.println(test);
		test.popEmAll();
		out.println("\n\n");

		test.setStack("# $ % ^ * ( ) ( _");
		out.println(test);
		test.popEmAll();
		out.println("\n\n");

		test = new StackTest();
		out.println(test);
		test.popEmAll();
		out.println("\n\n");
	}
}

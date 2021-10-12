import java.util.Stack;

import static java.lang.System.out;

public class StackTest {
	private Stack<String> stack;

	// call setStack with an empty String
	public StackTest() {
		setStack("");
	}

	// call setStack with line
	public StackTest(String line) {
		setStack(line);
	}

	// initialize stack as an empty Stack
	// push each token from line to the stack
	public void setStack(String line) {
		stack = new Stack<>();

		String[] tokens = line.split(" ");

		for (String token : tokens) {
			stack.push(token);
		}
	}

	// as long as there is something on the stack, pop it and print it!
	public void popEmAll() {
		out.println("popping all items from the stack");

		while (!stack.isEmpty()) {
			out.println(stack.pop());
		}
	}

	@Override
	public String toString() {
		return "" + stack + "\n";
	}
}

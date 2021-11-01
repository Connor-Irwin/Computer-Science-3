import java.util.EmptyStackException;

import static java.lang.System.out;

public class MyStackRunner {
    public static void main(String[] args) {

        MyStack m = new MyStack();

        out.println(m.isEmpty() + "\n");

        try {
            m.pop();
        } catch (EmptyStackException e) {
            out.println("Attempting to pop an empty stack works!");
        }

        m.push(4);
        m.push(6);
        m.push(3);
        m.push(7);

        out.println("\nIn the stack:\n\n" + m);

        out.print("\n" + m.pop() + " ");
        out.print(m.peek() + " ");
        out.print(m.pop() + " ");
        out.println(m.peek());

        m.push(20);
        m.push(12);
        m.push(6);

        m.pop();
        m.pop();
        m.pop();

        out.println("\n" + m.isEmpty());
    }
}
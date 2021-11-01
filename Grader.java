/*****************************************
 *  DO NOT DELETE OR CHANGE THIS FILE!!! *
 *****************************************/

import java.util.EmptyStackException;

import static java.lang.System.out;

public class Grader {
    public static void main(String[] args) {
        MyStack m0 = new MyStack();
        MyStack m1 = new MyStack(10);
        if (args[0].equals("isEmpty")) {
            out.println(m0.isEmpty() + "" + m1.isEmpty()); // truetrue
        } else if (args[0].equals("push0")) {
            m0.push(6);
            m0.push(5);
            m0.push(4);
            m0.push(3);
            m0.push(2);
            m0.push(1);
            out.println(m0.isEmpty() + "" + m0.peek()); // false1
        } else if (args[0].equals("push1")) {
            m1.push(6);
            m1.push(5);
            m1.push(4);
            m1.push(3);
            m1.push(2);
            m1.push(1);
            out.println(m1.isEmpty() + "" + m1.peek()); // false1
        } else if (args[0].equals("pop0")) {
            try {
                m0.pop();
            } catch (EmptyStackException e) {
                out.println("ok"); // ok
            }
        } else if (args[0].equals("pop1")) {
            m0.push(7);
            out.println(m0.pop()); // 7
        } else if (args[0].equals("peek0")) {
            try {
                m0.peek();
            } catch (EmptyStackException e) {
                out.println("ok"); // ok
            }
        } else if (args[0].equals("peek1")) {
            m0.push(7);
            out.println(m0.peek()); // 7
        } else if (args[0].equals("toString")) {
            m1.push(6);
            m1.push(5);
            m1.push(4);
            m1.push(3);
            m1.push(2);
            m1.push(1);
            out.println(m1); // 1\t<----- TOP\n2\n3\n4\n5\n6
        }
    }
}
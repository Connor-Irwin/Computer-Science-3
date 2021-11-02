import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalinList {
    private Queue<String> queue;
    private Stack<String> stack;

    public PalinList() {
        setList("");
    }

    public PalinList(String str) {
        setList(str);
    }

    public void setList(String str) {
        queue = new LinkedList<>();
        stack = new Stack<>();

        for (String word : str.split(" ")) {
            queue.offer(word);
            stack.push(word);
        }
    }

    public boolean isPalin() {
        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.poll())) return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "" + stack.toString();
    }
}
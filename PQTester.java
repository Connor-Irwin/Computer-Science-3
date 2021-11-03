import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class PQTester {
    private Queue<String> pQueue;

    /**
     * Call setPQ with an empty String
     */
    public PQTester() {
        setPQ("");
    }

    /**
     * Call setPQ with list
     */
    public PQTester(String list) {
        setPQ(list);
    }

    /**
     * Initialize pQueue and
     * add all tokens from list (in order)
     */
    public void setPQ(String list) {
        pQueue = new PriorityQueue<>();

        for (String item : list.split(" ")) {
            pQueue.offer(item);
        }
    }

    /**
     * Return the smallest value in pQueue
     */
    public String getMin() {
        return pQueue.peek();
    }

    /**
     * Return a String of all values in pQueue
     * in natural order with a space after each element
     */
    public String getNaturalOrder() {
        Object[] array = pQueue.toArray();
        Arrays.sort(array);

        StringBuilder output = new StringBuilder();
        for (Object item : array) {
            output.append(item + " ");
        }

        return output.toString();
    }

    /**
     * Write a toString method below!
     */
    @Override
    public String toString() {
        return pQueue.toString();
    }
}
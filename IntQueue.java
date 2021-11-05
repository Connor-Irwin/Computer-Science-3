public class IntQueue {
    private int[] queue;
    private int size;

    /**
     * Initialize queue with an initial capacity of 5
     * The queue should be empty, so size is 0
     * Call the one-parameter constructor
     * using this(5)
     */
    public IntQueue() {
        this(5);    // Already done!
    }

    /**
     * Initialize queue with an initial capacity of initCap
     * The queue should be empty, so size is 0
     */
    public IntQueue(int initCap) {
        queue = new int[initCap];
        size = 0;
    }

    /**
     * Return the number of ints currently in the queue.
     * This is not the same as the length of the instance
     * variable array!
     */
    public int size() {
        return size;
    }

    /**
     * Add an int to the back of the queue
     * If space runs out, call doubleCapacity()
     */
    public void offer(int item) {
        if (queue.length == size) doubleCapacity();
        queue[size] = item;
        size += 1;
    }

    /**
     * Remove and return the int at the front of the queue
     * If the queue is empty, return Integer.MIN_VALUE
     */
    public int poll() {
        if (queue[0] == 0) return Integer.MIN_VALUE;

        int poll = queue[0];

        if (size - 1 >= 0) System.arraycopy(queue, 1, queue, 0, size);
        queue[--size] = 0;

        return poll;
    }

    /**
     * Return the int at the front of the queue without removing it
     * If the queue is empty, return Integer.MIN_VALUE
     */
    public int peek() {
        if (queue[0] == 0) return Integer.MIN_VALUE;
        return queue[0];
    }

    /**
     * Return true if there are 0 ints currently in the queue;
     * otherwise, return false
     */
    public boolean isEmpty() {
        return queue[0] == 0;
    }

    /**
     * This private helper method doubles the length of the
     * array backing the queue if space runs out.
     */
    private void doubleCapacity() {
        int[] doubleCap = new int[queue.length * 2];
        System.arraycopy(queue, 0, doubleCap, 0, queue.length);
        queue = doubleCap;
    }

    /**
     * Return a string representation of the queue in which the
     * queue is surrounded by [] and each int is separated by a
     * comma and a space
     * For example: [1, 2, 3, 4]
     */
    public String toString() {
        StringBuilder output = new StringBuilder("[");

        for (int i = 0; i < size; i++) {
            if (i + 1 == size) output.append(queue[i]);
            else output.append(queue[i] + ", ");
        }

        output.append("]");

        return output.toString();
    }
}
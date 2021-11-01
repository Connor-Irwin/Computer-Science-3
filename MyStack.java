/**
 * This class implements a stack of Integer objects.
 */

import java.util.EmptyStackException;

public class MyStack {
    private Integer[] stack;
    private int size, min, max;

    public MyStack() {
        this(5);
    }

    public MyStack(int initCap) {
        stack = new Integer[initCap];
        size = 0;
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public Integer peek() {
        if (isEmpty()) throw new EmptyStackException();
        return stack[size - 1];
    }

    public Integer pop() {
        if (isEmpty()) throw new EmptyStackException();
        return stack[--size];
    }

    public void push(Integer item) {
        if (size == stack.length) doubleCapacity();
        stack[size++] = item;

        if (item < min) min = item;
        if (item > max) max = item;
    }

    private void doubleCapacity() {
        Integer[] doubleStack = new Integer[stack.length * 2];
        System.arraycopy(stack, 0, doubleStack, 0, stack.length);
        stack = doubleStack;
    }

    public Integer getMin() {
        return min;
    }

    public Integer getMax() {
        return max;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < stack.length; i++) {
            if (stack[i] != null) {
                if (i == stack.length - 2) {
                    output.insert(0, stack[i] + "\t<----- TOP" + "\n");
                } else {
                    output.insert(0, stack[i] + "\n");
                }
            }
        }
        return output.toString();
    }
}
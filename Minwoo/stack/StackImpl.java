package stack;

import java.util.EmptyStackException;

public class StackImpl {
    private Object[] stack = new Object[100];
    private int size = 0;

    public void push(Object element) {
        stack[size++] = element;
    }

    public Object pop() {
        if (isEmpty()) throw new EmptyStackException();
        return stack[--size];
    }

    public Object peek() {
        if (isEmpty()) throw new EmptyStackException();
        return stack[size - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        String str = "[";
        for (int i = 0; i < size; i++) {
            str += stack[i];
            if (i < size - 1) str += ", ";
        }
        return str + "]";
    }
}

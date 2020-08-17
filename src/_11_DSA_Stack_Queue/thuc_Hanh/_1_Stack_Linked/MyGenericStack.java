package _11_DSA_Stack_Queue.thuc_Hanh._1_Stack_Linked;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;

    public MyGenericStack() {
        stack = new LinkedList();
    }
    // Phương thức push:

    public void push(T element) {
        stack.addFirst(element);
    }

    // Phương thức pop:

    public T pop() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    // Phương thức size:

    public int size() {
        return stack.size();
    }

    // phương thức isEmpty:

    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }

}
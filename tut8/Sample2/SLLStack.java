package tut8.Sample2;

import java.util.*;

public class SLLStack {
    private StackNode top;

    public void push(char data) {
        StackNode newNode = new StackNode(data);
        newNode.setNext(top);
        top = newNode;
    }

    public char pop() {
        if (top == null) {
            throw new EmptyStackException();
        }

        char data = top.getData();
        top = top.getNext();
        return data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        StackNode current = top;
        while (current != null) {
            sb.append(current);
            current = current.getNext();
        }

        return sb.toString();
    }
}

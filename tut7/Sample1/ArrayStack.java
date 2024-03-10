package tut7.Sample1;

public class ArrayStack {
    private String[] stack;
    private int top;

    public ArrayStack(int capacity) {
        this.stack = new String[capacity];
        this.top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return stack.length - 1 == top;
    }

    public void push(String newItem) {
        if (!isFull())
            stack[++top] = newItem;
        else
            throw new IndexOutOfBoundsException("Stack overflow!");
    }

    public String pop() {
        if (isEmpty()) {
            System.err.println("Stack underflow!");
            return null;
        }

        return stack[top--];
    }

    public String peak (){
        if (isEmpty()) {
            System.err.println("Stack underflow!");
            return null;
        }

        return stack[top];
    }
}

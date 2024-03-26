package tut8.Ex1;

public class ArrayStack {
    private int top;
    private int[] stackArray;

    public ArrayStack(int capacity) {
        this.top = -1;
        this.stackArray = new int[capacity];
    }

    public void push(int value) {
        stackArray[++top] = value;
    }

    public int pop() {
        return stackArray[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

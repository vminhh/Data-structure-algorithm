package tut8.Sample1;

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
}

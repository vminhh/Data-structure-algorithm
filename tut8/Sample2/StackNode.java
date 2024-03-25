package tut8.Sample2;

public class StackNode {
    private char data;
    private StackNode next;

    public StackNode(char data) {
        this.data = data;
        this.next = null;
    }

    public StackNode getNext() {
        return next;
    }

    public char getData() {
        return data;
    }

    public void setNext(StackNode n) {
        this.next = n;
    }

    @Override
    public String toString() {
        return String.valueOf(getData());
    }
}

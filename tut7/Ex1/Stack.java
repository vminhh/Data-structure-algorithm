package tut7.Ex1;

public class Stack {
    private Node top;

    public Stack() {
        this.top = null;
    }

    public void push(char data) {
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
        } else {
            newNode.setNext(top);
            ;
            top = newNode;
        }
    }

    public char pop() {
        if (top == null) {
            throw new IllegalStateException("Stack underflow!");
        }
        char data = (char) top.getData();
        top = top.getNext();
        return data;
    }

    public char peak() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack underflow!");
        }
        return (char) top.getData();
    }

    public void display() {
        if (top == null) {
            throw new IllegalStateException("Stack underflow!");
        }

        Node current = top;
        while (current != null) {
            System.out.print((char) current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return top == null;
    }
}

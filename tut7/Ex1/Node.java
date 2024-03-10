package tut7.Ex1;

public class Node {
    private char data;
    private Node next;

    public Node(char data) {
        this.data = data;
        this.next = null;
    }
    
    public Node getNext() {
        return next;
    }

    public void setNext(Node n) {
        this.next = n;
    }

    public char getData() {
        return data;
    }

    public void setData(char data) {
        this.data = data;
    }

    public void print() {
        System.out.println("Data: " + data);
    }
}

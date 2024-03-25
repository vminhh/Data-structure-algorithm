package tut7.Sample2;

public class QueueNode {
    private int data;
    private QueueNode next;

    public QueueNode(int data) {
        this.data = data;
        this.next = null;
    }

    public void setNext(QueueNode n) {
        this.next = n;
    }

    public QueueNode getNext() {
        return next;
    }

    public void setData(int d) {
        this.data = d;
    }

    public int getData() {
        return data;
    }
}

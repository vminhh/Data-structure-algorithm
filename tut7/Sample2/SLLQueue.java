package tut7.Sample2;

public class SLLQueue {
    private QueueNode front;
    private QueueNode rare; 

    public SLLQueue() {
        this.front = null;
        this.rare = null;
    }

    public boolean isEmpty() {
        return front == null && rare == null;
    }

    public void enqueue(QueueNode newNode) {
        if (isEmpty()) {
            this.front = newNode;
            this.rare = newNode;
        } else {
            this.rare.setNext(newNode);
            this.rare = newNode;
        }
    }

    public QueueNode dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue underflow!");
        }

        QueueNode removed = this.front;
        if (this.front == this.rare) {
            this.front = null;
            this.rare = null;
        } else {
            front = front.getNext();
        }

        return removed;
    }

    public QueueNode retrieve() {
        if (!isEmpty())
            return front;
        else
            throw new IllegalStateException("Queue underflow!");
    }
}

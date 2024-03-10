package tut7.Ex2;

public class Queue {
    private int[] arr;
    private int front;
    private int rear;
    private int size;

    public Queue(int cap) {
        this.arr = new int[cap];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public void enqueue(int item) {
        if (isFull()) {
            throw new IllegalStateException("Queue overflow!");
        }
        arr[++rear] = item;
        ++size;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue underflow!");
        }

        int removed = arr[front++];
        size--;

        return removed;
    }

    public int retrieve() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue underflow!");
        }

        return arr[front];
    }

    public void display() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue underflow!");
        }

        for (int i = front; i <=rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public boolean isFull() {
        return rear == arr.length - 1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * @bonus
     *        if the queue is full
     *        throw new exception
     *        else
     *        increase rear idx by 1
     *        then add the new element at updated rare idx
     *        increment size
     */

    @SuppressWarnings("unuse")
    public void enQueue(int data) {
        if (isFull()) {
            throw new IllegalStateException("Queue overflow");
        }

        rear = (rear + 1) % arr.length;
        arr[rear] = data;
        ++size;
    }

    /**
     * @bonus
     *        if the queue is empty
     *        throw exception
     *        else
     *        retrieve the element at front idx
     *        increse front idx by 1 to remove the fisrt element from queue
     *        decrement size
     */

    @SuppressWarnings("unuse")
    public int deQueue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue underflow!");
        }

        int data = arr[front];
        front = (front + 1) % arr.length;
        --size;
        return data;
    }
}

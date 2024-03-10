package tut7.Sample2;

public class SLLQueueApp {
    public static void main(String[] args) {
        SLLQueue test = new SLLQueue();
        test.enqueue(new QueueNode(25));
        test.enqueue(new QueueNode(3));
        test.enqueue(new QueueNode(2004));
        printQueue(test);

        test.dequeue();
        printQueue(test);

        System.out.println("Max = " + findMax(test) + "\nMin = " + findMin(test));
    }

    public static void printQueue(SLLQueue q) {
        if (!q.isEmpty()) {
            QueueNode current = q.retrieve();
            while (current != null) {
                System.out.print(current.getData() + " ");
                current = current.getNext();
            }
            System.out.println();
        } else
            throw new IllegalStateException("Queue underflow!");
    }

    public static int findMax(SLLQueue q) {
        int max = Integer.MIN_VALUE;
        if (!q.isEmpty()) {
            QueueNode current = q.retrieve();
            while (current != null) {
                if (current.getData() > max) {
                    max = current.getData();
                }
                current = current.getNext();
            }
            return max;
        } else
            throw new IllegalStateException("Queue underflow!");
    }

    public static int findMin(SLLQueue q) {
        int min = Integer.MAX_VALUE;
        if (!q.isEmpty()) {
            QueueNode current = q.retrieve();
            while (current != null) {
                if (current.getData() < min) {
                    min = current.getData();
                }
                current = current.getNext();
            }
            return min;
        } else
            throw new IllegalStateException("Queue underflow!");
    }
}

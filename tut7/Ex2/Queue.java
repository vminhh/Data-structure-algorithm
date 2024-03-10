package tut7.Ex2;

public class Queue {
    private int[] arr;
    private int front;
    private int rare;
    private int capacity;

    public Queue(int cap) {
        this.arr = new int[capacity];
        this.front = 0;
        this.rare = 0;
        this.capacity = cap;
    }

    public boolean isFull() {
        return rare == capacity -1;
    }
    public boolean isEmpty(){
        return front == 0;
    }
    // toi lam tiep
}

package tut6;

import java.util.Arrays;

public class ArrayList {
    private int[] arr;
    private int size = -1;
    private int capacity;

    public ArrayList(int cap) {
        this.arr = new int[cap];
        this.capacity = cap;
    }

    public void add(int data) {
        if (isFull()) {
            throw new IndexOutOfBoundsException("Stack is full. Can not add!");
        }

        arr[++size] = data;
    }

    public void remove(int pos) {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("stack is empty. Can not remove!");
        }

        for (int i = pos; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        --size;
    }

    public void add(int pos, int data) {
        if (isFull() || pos < 0) {
            throw new IndexOutOfBoundsException("Stack is full. Can not add!");
        }
        arr[pos] = data;
        for (int i = size; i > pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos] = data;
        ++size;
    }

    public boolean isFull() {
        return size == capacity - 1;
    }

    public boolean isEmpty() {
        return size == -1;
    }

    public int size() {
        return size;
    }

    public void printNode(int pos) {
        System.out.println(pos + ": " + arr[pos]);
    }

    public void printList() {
        System.out.println(java.util.Arrays.toString(Arrays.copyOf(arr, size)));
    }
}

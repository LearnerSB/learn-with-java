package org.learnwithjava.dsa.queue;

public class CircularQueueWithArray {

    private int arr[];
    private int rear;
    private int front;
    private int size;

    public CircularQueueWithArray(int size) {
        this.size = size;
        this.arr = new int[size];
        this.rear = this.front = -1;
    }

    public boolean isEmpty() {
        if (front == -1) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if ((front == 0 && rear == arr.length -1) || (front == rear + 1)) {
            return true;
        }
        return false;
    }

    public void enQueue(int data) {
        if (isFull()) {
            System.out.println("The queue is Full");
            return;
        }
        if (front == -1) {
            front = 0;
        }
        if (rear == arr.length - 1) { // rear is at the last position
            rear = 0;
        } else {
            rear+= 1;
        }
        arr[rear] = data;
    }

    public int deQueue() {
        if (isEmpty()) {
            System.out.println("The queue is Empty");
            return -1;
        }
        int result = arr[front];
        if (front == rear) { // queue has only one element
            front = rear = -1;
        } else if (front == arr.length - 1) {
            front = 0;
        } else {
            front++;
        }
        return result;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("The queue is Empty");
            return -1;
        }
        return arr[front];
    }
}

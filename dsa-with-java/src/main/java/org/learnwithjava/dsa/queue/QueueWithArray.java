package org.learnwithjava.dsa.queue;

public class QueueWithArray {
    private int arr[];
    private int rear;
    private int front;

    public QueueWithArray(int size) {
        this.arr = new int[size];
        this.rear = this.front = -1;
        System.out.println("The queue created with size: " + size);
    }

    public boolean isFull() {
        if (rear == arr.length - 1) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if ((front == -1) || front == arr.length) {
            return true;
        }
        return false;
    }

    public void enQueue(int data) {
        if (isFull()) {
            System.out.println("The queue is Full");
            return;
        }

        if (isEmpty()) {
            arr[++rear] = data;
            front = 0;
        } else {
            arr[++rear] = data;
        }
    }

    public int deQueue() {
        if (isEmpty()) {
            System.out.println("The queue is Empty");
            return -1;
        }
        int result = arr[front];
        front++;
        if (front > rear) {
            front = rear = -1;
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

    public void deleteQueue() {
        arr = null;
        front = rear = -1;
        System.out.println("The queue is successfully deleted");
    }

    // at any point of time the number of elements in the queue is (rear - front + 1)
    // except initially empty queue.

    // overflow condition: rear == size of array - 1

    // underflow condition: front = rear = -1 && front == (rear + 1)
}

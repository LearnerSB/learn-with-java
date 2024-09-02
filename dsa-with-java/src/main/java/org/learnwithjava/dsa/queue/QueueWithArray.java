package org.learnwithjava.dsa.queue;

public class QueueWithArray {
    private int arr[];
    private int topOfQueue;
    private int beginningOfQueue;

    public QueueWithArray(int size) {
        this.arr = new int[size];
        this.topOfQueue = this.beginningOfQueue = -1;
        System.out.println("The queue created with size: " + size);
    }

    public boolean isFull() {
        if (topOfQueue == arr.length - 1) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if ((beginningOfQueue == -1) || beginningOfQueue == arr.length) {
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
            arr[++topOfQueue] = data;
            beginningOfQueue = 0;
        } else {
            arr[++topOfQueue] = data;
        }
    }

    public int deQueue() {
        if (isEmpty()) {
            System.out.println("The queue is Empty");
            return -1;
        }
        int result = arr[beginningOfQueue];
        beginningOfQueue++;
        if (beginningOfQueue > topOfQueue) {
            beginningOfQueue = topOfQueue = -1;
        }
        return result;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("The queue is Empty");
            return -1;
        }
        return arr[beginningOfQueue];
    }

    public void deleteQueue() {
        arr = null;
        beginningOfQueue = topOfQueue = -1;
        System.out.println("The queue is successfully deleted");
    }
}

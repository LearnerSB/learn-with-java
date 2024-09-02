package org.learnwithjava.dsa.queue;

public class CircularQueueWithArray {

    private int arr[];
    private int topOfQueue;
    private int beginningOfQueue;
    private int size;

    public CircularQueueWithArray(int size) {
        this.size = size;
        this.arr = new int[size];
        this.topOfQueue = this.beginningOfQueue = -1;
    }
}

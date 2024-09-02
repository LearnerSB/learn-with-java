package org.learnwithjava.dsa.stack;

public class StackWithArray {

    private int[] arr;
    private int topOfStack;

    public StackWithArray(int size) {
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("The stack created with size: " + size);
    }

    public boolean isEmpty() {
        if (topOfStack == -1) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (topOfStack == arr.length - 1) {
            return true;
        }
        return false;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("The stack is Full");
            return;
        }
        arr[topOfStack + 1] = data;
        topOfStack++;
    }

    public int push() {
        if (isEmpty()) {
            System.out.println("The stack is Empty");
            return -1;
        }
        int topElement = arr[topOfStack];
        topOfStack--;
        return topOfStack;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("The stack is Empty");
            return -1;
        }
        return arr[topOfStack];
    }

    public void deleteStack() {
        arr = null;
        topOfStack = -1;
        System.out.println("The stack is successfully deleted");
    }
}

package org.learnwithjava.dsa.queue;

import org.learnwithjava.dsa.linkedlists.SinglyLinkedList;

public class QueueWithLinkedList {

    private SinglyLinkedList linkedList;

    public QueueWithLinkedList() {
        this.linkedList = new SinglyLinkedList();
    }

    public boolean isEmpty() {
        if (linkedList.getHead() == null) {
            return true;
        }
        return false;
    }

    public void enQueue(int data) {
        linkedList.insertIntoSinglyLL(data, linkedList.getSize());
    }

    public int deQueue() {
        int result = -1;
        if (isEmpty()) {
            System.out.println("The queue is Empty");
            return result;
        }
        result = linkedList.getHead().data;
        linkedList.deleteSinglyLLNode(0);
        return result;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("The queue is Empty");
            return -1;
        }
        return linkedList.getHead().data;
    }

    public void deleteQueue() {
        linkedList.setHead(null);
        System.out.println("The queue is successfully deleted");
    }
}

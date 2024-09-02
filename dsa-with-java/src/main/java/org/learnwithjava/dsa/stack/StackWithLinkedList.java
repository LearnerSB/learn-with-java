package org.learnwithjava.dsa.stack;

import org.learnwithjava.dsa.linkedlists.SinglyLinkedList;

public class StackWithLinkedList {

    private SinglyLinkedList singlyLinkedList;

    public StackWithLinkedList() {
        this.singlyLinkedList = new SinglyLinkedList();
    }

    public void push(int data) {
        singlyLinkedList.insertIntoSinglyLL(data, 0);
    }

    public boolean isEmpty() {
        if (singlyLinkedList.getHead() == null) {
            return true;
        }
        return false;
    }

    public int pop() {
        int result = -1;
        if (isEmpty()) {
            System.out.println("The stack is Empty");
            return result;
        }
        result = singlyLinkedList.getHead().data;
        singlyLinkedList.deleteSinglyLLNode(0);
        return result;
    }

    public int peek() {
        int result = -1;
        if (isEmpty()) {
            System.out.println("The stack is Empty");
            return result;
        }
        return singlyLinkedList.getHead().data;
    }

    public void deleteStack() {
        singlyLinkedList.setHead(null);
        System.out.println("The stack is successfully deleted");
    }
}

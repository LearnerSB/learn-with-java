package org.learnwithjava.dsa.linkedlists;

import org.learnwithjava.dsa.nodes.DoublyLLNode;

public class DoublyLinkedList {
    private DoublyLLNode head;
    private DoublyLLNode tail;
    private int size;

    public DoublyLLNode createDoublyLLNode(int data) {
        DoublyLLNode newNode = new DoublyLLNode();
        newNode.data = data;
        newNode.next = null;
        newNode.prev = null;
        head = newNode;
        tail = newNode;
        size = 1;
        System.out.println("Doubly Linked List created with Head element");
        return head;
    }

    public void insertIntoDoublyLL(int data, int position) {
        DoublyLLNode newNode = new DoublyLLNode();
        newNode.data = data;
        if (head == null) {
            createDoublyLLNode(data);
            return;
        } else if (position == 0) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        } else if (position >= size) {
            newNode.next = null;
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        } else {
            DoublyLLNode currentNode = head;
            int index = 0;
            while (index < position - 1) {
                currentNode = currentNode.next;
                index++;
            }
            newNode.prev = currentNode;
            newNode.next = currentNode.next;
            currentNode.next = newNode;
            newNode.next.prev = newNode;
        }
        size++;
    }

    public void deleteDoublyLLNode(int position) {
        if (head == null) {
            System.out.println("Doubly Linked List doesn't exist");
        } else if (position == 0) {
            if (size == 1) {
                head = null;
                tail = null;
                size--;
            } else {
                head = head.next;
                head.prev = null;
                size--;
            }
        } else if (position >= size) {
            DoublyLLNode tempNode = tail.prev;
            if (size == 1) {
                head = null;
                tail = null;
                size--;
            } else {
                tempNode.next = null;
                tail = tempNode;
                size--;
            }
        } else {
            DoublyLLNode tempNode = head;
            for (int i = 0; i < position-1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            tempNode.next.prev = tempNode;
            size--;
        }

    }

    public void deleteDoublyLLNode() {
        DoublyLLNode currentNode = head;
        for (int i =0; i< size; i++) {
            currentNode.prev = null;
            currentNode = currentNode.next;
        }
        head = null;
        tail = null;
        System.out.println("The Doubly Linked List has been deleted successfully!");
    }

    public void reverseDoubleLinkedList() {
        if (head == null) {
            System.out.println("Doubly Linked List doesn't exist");
            return;
        }
        DoublyLLNode currentNode = tail;
        for (int i = 0; i < size; i++) {
            System.out.print(currentNode.data);
            if (i != size - 1) {
                System.out.print(" <-> ");
            }
            currentNode = currentNode.prev;
        }
        System.out.println();
    }

    public void traverseDoublyLL() {
        if (head == null) {
            System.out.println("Doubly Linked List doesn't exist");
            return;
        }
        DoublyLLNode currentNode = head;
        for (int i = 0; i < size; i++) {
            System.out.print(currentNode.data);
            if (i != size - 1) {
                System.out.print(" <-> ");
            }
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public boolean searchDoublyLLNode(int data) {
        if (head == null) {
            System.out.println("Doubly Linked List doesn't exist");
            return false;
        }
        DoublyLLNode currentNode = head;
        for (int i = 0; i < size; i++) {
            if (currentNode.data == data) {
                System.out.println("Data: " + data + " found at position: " + i);
                return true;
            }
            currentNode = currentNode.next;
        }
        System.out.println("Data: " + data + " not found in Singly Linked List");
        return false;
    }

}

package org.learnwithjava.dsa.linkedlists;

import org.learnwithjava.dsa.nodes.LinkedListNode;

public class CircularLinkedList {

    private LinkedListNode head;
    private LinkedListNode tail;
    private int size;

    public LinkedListNode createCircularLL(int data) {
        LinkedListNode newNode = new LinkedListNode();
        newNode.data = data;
        head = newNode;
        tail = newNode;
        tail.next = head;
        size = 1;
        System.out.println("Circular Linked List created with Head element");
        return newNode;
    }

    public void insertIntoCircularLL(int data, int position) {
        LinkedListNode newNode = new LinkedListNode();
        newNode.data = data;
        if (head == null) {
            createCircularLL(data);
            return;
        } else if (position == 0) {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        } else if (position >= size) {
            newNode.next = null;
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        } else {
            LinkedListNode currentNode = head;
            int index = 0;
            while (index < position - 1) {
                currentNode = currentNode.next;
                index++;
            }
            LinkedListNode nextNode = currentNode.next;
            currentNode.next = newNode;
            newNode.next = nextNode;
        }
        size++;
    }

    public void deleteCircularLL(int position) {
        if (head == null) {
            System.out.println("Circular Linked List doesn't exist");
        } else if (position == 0) {
            head = head.next;
            tail.next = head;
            size--;
            if (size == 0){
                head = tail = null;
            }
        } else if (position >= size) {
            LinkedListNode currentNode = head;
            for (int i = 0; i < size - 1; i++) {
                currentNode = currentNode.next;
            }
            if (currentNode == head) {
                tail = head = null;
                size--;
                return;
            }
            currentNode.next = head;
            tail = currentNode;
            size--;
        } else {
            LinkedListNode currentNode = head;
            for (int i = 0; i < position - 1; i++) {
                currentNode = currentNode.next;
            }
            currentNode.next = currentNode.next.next;
            size--;
        }

    }

    public void deleteEntireCircleLL() {
        if (head == null) {
            System.out.println("Circle Linked List doesn't exist");
            return;
        }
        head = tail = null;
        size = 0;
        System.out.println("Circle Linked List deleted successfully");
    }

    public void traverseCircularLL() {
        if (head == null) {
            System.out.println("Circular Linked List doesn't exist");
            return;
        }
        LinkedListNode currentNode = head;
        for (int i = 0; i < size; i++) {
            System.out.print(currentNode.data);
            if (i != size - 1) {
                System.out.print(" -> ");
            }
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public boolean searchSinglyLLNode(int data) {
        if (head == null) {
            System.out.println("Circular Linked List doesn't exist");
            return false;
        }
        LinkedListNode currentNode = head;
        for (int i = 0; i < size; i++) {
            if (currentNode.data == data) {
                System.out.println("Data: " + data + " found at position: " + i);
                return true;
            }
            currentNode = currentNode.next;
        }
        System.out.println("Data: " + data + " not found in Circular Linked List");
        return false;
    }
}

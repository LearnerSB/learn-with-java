package org.learnwithjava.dsa.linkedlists;

import org.learnwithjava.dsa.nodes.LinkedListNode;

public class SinglyLinkedList {
    private LinkedListNode head;
    private LinkedListNode tail;
    private int size;

    public LinkedListNode createSinglyLL(int data) {
        LinkedListNode newNode = new LinkedListNode();
        newNode.data = data;
        head = newNode;
        tail = newNode;
        size = 1;
        System.out.println("Singly Linked List created with Head element");
        return head;
    }

    public void insertIntoSinglyLL(int data, int position) {
        LinkedListNode newNode = new LinkedListNode();
        newNode.data = data;
        if (head == null) {
            createSinglyLL(data);
            return;
        } else if (position == 0) {
            newNode.next = head;
            head = newNode;
        } else if (position >= size) {
            newNode.next = null;
            tail.next = newNode;
            tail = newNode;
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

    public void deleteSinglyLLNode(int position) {
        if (head == null) {
            System.out.println("Singly Linked List doesn't exist");
        } else if (position == 0) {
            head = head.next;
            size--;
            if (size == 0){
                tail = null;
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
            currentNode.next = null;
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

    public void deleteEntireSinglyLL() {
        if (head == null) {
            System.out.println("Singly Linked List doesn't exist");
            return;
        }
        head = tail = null;
        size = 0;
        System.out.println("Singly Linked List deleted successfully");
    }

    public void traverseSinglyLL() {
        if (head == null) {
            System.out.println("Singly Linked List doesn't exist");
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
            System.out.println("Singly Linked List doesn't exist");
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
        System.out.println("Data: " + data + " not found in Singly Linked List");
        return false;
    }

    // to get the head for stack/ queue with Linked List implementation
    public LinkedListNode getHead() {
        return head;
    }

    // to set the head for stack/ queue with Linked List implementation
    public void setHead(LinkedListNode head) {
        this.head = head;
    }

    // to get the size for stack/ queue with Linked List implementation
    public int getSize() {
        return size;
    }
}

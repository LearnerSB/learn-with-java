package org.learnwithjava.dsa.linkedlists.client;

import org.learnwithjava.dsa.linkedlists.DoublyLinkedList;

public class DoublyLinkedListMain {

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.createDoublyLLNode(1);
        doublyLinkedList.insertIntoDoublyLL(2, 0);
        doublyLinkedList.insertIntoDoublyLL(3, 1);
        doublyLinkedList.insertIntoDoublyLL(4, 7);
        doublyLinkedList.traverseDoublyLL();
        doublyLinkedList.deleteDoublyLL();
        doublyLinkedList.traverseDoublyLL();
    }
}

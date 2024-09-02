package org.learnwithjava.dsa.linkedlists.client;

import org.learnwithjava.dsa.linkedlists.SinglyLinkedList;

public class SinglyLinkedListMain {

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.createSinglyLL(1);
        singlyLinkedList.insertIntoSinglyLL(2, 2);
        singlyLinkedList.traverseSinglyLL();
    }
}

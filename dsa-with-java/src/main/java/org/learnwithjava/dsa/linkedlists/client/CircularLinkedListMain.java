package org.learnwithjava.dsa.linkedlists.client;

import org.learnwithjava.dsa.linkedlists.CircularLinkedList;

public class CircularLinkedListMain {

    public static void main(String[] args) {
        CircularLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.createCircularLL(1);
        circularLinkedList.insertIntoCircularLL(2, 2);
        circularLinkedList.traverseCircularLL();
    }

}

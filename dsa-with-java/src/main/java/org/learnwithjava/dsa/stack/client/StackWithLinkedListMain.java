package org.learnwithjava.dsa.stack.client;

import org.learnwithjava.dsa.stack.StackWithLinkedList;

public class StackWithLinkedListMain {

    public static void main(String[] args) {
        StackWithLinkedList linkedList = new StackWithLinkedList();
        linkedList.push(1);
        linkedList.push(2);
        linkedList.push(3);

        linkedList.peek();
        linkedList.deleteStack();
    }
}

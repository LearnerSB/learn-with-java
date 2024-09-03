package org.learnwithjava.dsa.recursion;

public class TowerOfHanoi {

    public static void main(String[] args) {
        processTowerOfHanoi(3, 'A', 'B', 'C');
    }

    public static void processTowerOfHanoi(int nDisk, char source, char temp, char destination) {
        if (nDisk == 1) {
            System.out.println("Move disk " + nDisk + " from " + source + " to " + destination);
            return;
        }
        processTowerOfHanoi(nDisk - 1, source, destination, temp);
        System.out.println("Move disk " + nDisk + " from " + source + " to " + destination);
        processTowerOfHanoi(nDisk - 1, temp, source, destination);
    }
}

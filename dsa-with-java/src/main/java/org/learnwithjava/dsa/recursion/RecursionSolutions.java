package org.learnwithjava.dsa.recursion;

public class RecursionSolutions {

    public static void main(String[] args) {
        System.out.println("factorial of " + 5 + " is: " + processFactorial(5));
    }

    public static int processFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        return number * processFactorial(number - 1);
    }

    public int processSumDigits(int number) {
        if (number / 10 == 0) {
            return number;
        }
        return (number % 10) + processSumDigits(number / 10);
    }
}

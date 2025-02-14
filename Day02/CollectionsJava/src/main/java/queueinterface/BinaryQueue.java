package queueinterface;

import java.util.*;

public class BinaryQueue {

    // This method generates binary representations of integers from 1 to n
    public static Queue<String> binaryString(int n) {
        Queue<String> binaryQueue = new ArrayDeque<>(); // Create a new queue to store binary strings
        int i = 1;

        // Loop from 1 to n
        while (i <= n) {
            String binary = Integer.toBinaryString(i); // Convert the integer to its binary representation
            binaryQueue.offer(binary); // Add the binary string to the queue
            i++;
        }

        return binaryQueue; // Return the queue containing binary strings
    }

    public static void main(String args[]) {
        // Generate binary strings for integers from 1 to 5
        Queue<String> answer = binaryString(5);

        // Print the binary strings
        System.out.println("Binary Strings: " + answer);
    }
}

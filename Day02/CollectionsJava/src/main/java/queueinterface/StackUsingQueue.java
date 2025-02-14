package queueinterface;
import java.util.*;

public class StackUsingQueue {

    // This method demonstrates the implementation of a stack using queues
    public static void stackImplement(Deque<Integer> queue1) {
        Deque<Integer> queue2 = new LinkedList<>(); // Create a second queue to assist with reversing the order

        // Reverse the order of elements in queue1 and add them to queue2
        while (!queue1.isEmpty()) {
            int x = queue1.pollLast(); // Remove the last element from queue1
            queue2.offer(x); // Add the element to queue2
        }

        System.out.println("Element In LIFO Order: " + queue2); // Print elements in LIFO (Last In, First Out) order
    }

    public static void main(String args[]) {
        Deque<Integer> queue1 = new LinkedList<>(); // Create a new deque and add elements to it
        queue1.offer(1);
        queue1.offer(2);
        queue1.offer(3);

        System.out.println("Element IN FIFO Order: " + queue1); // Print elements in FIFO (First In, First Out) order
        stackImplement(queue1); // Call the stackImplement method to reverse the order and print elements in LIFO order
    }
}

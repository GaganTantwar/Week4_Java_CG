package queueinterface;
import java.util.*;

public class ReverseQueue {

    // This method reverses the elements of a queue
    public static Queue<Integer> reverseQueue(Queue<Integer> queue) {
        Queue<Integer> answer = new ArrayDeque<>(); // Create a new queue to store the reversed elements

        // If the queue is empty, return the empty answer queue
        if (queue.isEmpty()) {
            return answer;
        } else {
            Stack<Integer> st = new Stack<>(); // Create a stack to help with reversing the queue

            // Push all elements of the queue onto the stack
            for (Integer i : queue) {
                st.push(i);
            }

            // Pop elements from the stack and add them to the answer queue
            while (!st.empty()) {
                answer.offer(st.peek()); // Add the top element of the stack to the answer queue
                st.pop(); // Remove the top element from the stack
            }
        }

        return answer; // Return the reversed queue
    }

    public static void main(String args[]) {
        Queue<Integer> queue = new ArrayDeque<>(); // Create a new queue to store integers
        queue.offer(5);
        queue.offer(4);
        queue.offer(3);

        Queue<Integer> sorted = reverseQueue(queue); // Reverse the queue
        System.out.println("Queue in Sorted Order: " + sorted); // Print the reversed queue
    }
}

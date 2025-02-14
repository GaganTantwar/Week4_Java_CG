package listinterface;
import java.util.*;

public class RemoveNthElement {

    // This method removes and returns the Nth last element from a linked list
    public static char indexOfN(LinkedList<Character> list, int n) {
        char ans = '1'; // Initialize the answer with a default value
        for (int i = 0; i < n; i++) {
            ans = list.getLast(); // Get the last element of the list
            list.removeLast(); // Remove the last element from the list
        }
        return ans; // Return the Nth last element
    }

    public static void main(String args[]) {
        LinkedList<Character> list = new LinkedList<>(); // Create a new linked list to store characters
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');
        list.add('E');

        char answer = indexOfN(list, 2); // Remove and get the 2nd last element from the list
        System.out.println("Nth Last Element: " + answer); // Print the Nth last element
    }
}

package listinterface;
import java.util.*;

public class ReverseList {

    // This method reverses the elements of a list of integers
    public static List<Integer> reverseList(List<Integer> list) {
        int size = list.size();

        int temp1;
        int temp2;
        // Loop to swap elements from the start and end of the list
        for (int i = 0; i < size / 2; i++) {
            temp1 = list.get(i); // Get element from the start
            temp2 = list.get(size - i - 1); // Get element from the end
            list.set(i, temp2); // Set start element to end element
            list.set(size - 1 - i, temp1); // Set end element to start element
        }
        return list; // Return the reversed list
    }

    // This method reverses the elements of a LinkedList of integers
    public static LinkedList<Integer> reverseList(LinkedList<Integer> list) {
        int size = list.size();

        int temp1;
        int temp2;
        // Loop to swap elements from the start and end of the linked list
        for (int i = 0; i < size / 2; i++) {
            temp1 = list.get(i); // Get element from the start
            temp2 = list.get(size - i - 1); // Get element from the end
            list.set(i, temp2); // Set start element to end element
            list.set(size - 1 - i, temp1); // Set end element to start element
        }
        return list; // Return the reversed linked list
    }

    public static void main(String args[]) {
        // Create a new ArrayList and add elements to it
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        System.out.println("Before Reversing With ArrayList: " + list1); // Print the original ArrayList

        List<Integer> reverse1 = ReverseList.reverseList(list1); // Reverse the ArrayList
        System.out.println("After Reversing With ArrayList: " + reverse1); // Print the reversed ArrayList
        System.out.println(" ");

        // Create a new LinkedList and add elements to it
        List<Integer> list2 = new LinkedList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        System.out.println("Before Reversing With LinkedList: " + list2); // Print the original LinkedList

        List<Integer> reverse2 = ReverseList.reverseList((LinkedList<Integer>) list2); // Reverse the LinkedList
        System.out.println("After Reversing With LinkedList: " + reverse2); // Print the reversed LinkedList
        System.out.println(" ");
    }
}

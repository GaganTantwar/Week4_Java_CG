package listinterface;
import java.util.*;

public class DuplicateRemover {

    // This method removes duplicate elements from a list of integers
    public static List<Integer> duplicateRemove(List<Integer> list){
        List<Integer> unique = new ArrayList<>(); // Create a new list to store unique elements
        for (Integer i : list) {
            // If the unique list does not already contain the element, add it
            if (!unique.contains(i)) {
                unique.add(i);
            }
        }
        return unique; // Return the list of unique elements
    }

    public static void main(String args[]){
        List<Integer> list = new ArrayList<>(); // Create a new list to store integers
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        list.add(10);
        System.out.println("Normal List: " + list); // Print the original list

        List<Integer> uniqueList = duplicateRemove(list); // Remove duplicates from the list
        System.out.println("Unique List: " + uniqueList); // Print the list of unique elements
    }
}

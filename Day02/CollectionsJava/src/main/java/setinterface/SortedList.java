package setinterface;
import java.util.*;

public class SortedList {

    // This method sorts a set of integers and returns the sorted list
    public static List<Integer> sortSet(Set<Integer> set) {
        ArrayList<Integer> list = new ArrayList<>(set); // Convert the set to an ArrayList
        Collections.sort(list); // Sort the list using Collections.sort()
        return list; // Return the sorted list
    }

    public static void main(String args[]) {
        // Create a new linked hash set and add elements to it
        Set<Integer> set = new LinkedHashSet<>();
        set.add(50);
        set.add(40);
        set.add(30);
        set.add(20);
        set.add(10);

        // Sort the set and store the result in a list
        List<Integer> sortedList = SortedList.sortSet(set);
        System.out.println("Sorted List: " + sortedList); // Print the sorted list
    }
}

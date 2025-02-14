package setinterface;
import java.util.*;

public class EqualSets {

    // This method checks if two sets of integers are equal
    public static boolean checkSet(Set<Integer> s1, Set<Integer> s2) {
        if (s1.equals(s2)) { // Check if the sets are equal
            return true; // Return true if the sets are equal
        }
        return false; // Return false if the sets are not equal
    }

    public static void main(String args[]) {
        // Create a new linked hash set and add elements to it
        Set<Integer> set1 = new LinkedHashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println(set1); // Print the first set

        // Create another linked hash set and add elements to it
        Set<Integer> set2 = new LinkedHashSet<>();
        set2.add(3);
        set2.add(2);
        set2.add(1);
        System.out.println(set2); // Print the second set

        // Check if the two sets are equal
        boolean answer = EqualSets.checkSet(set1, set2);
        System.out.println("Sets are Equal: " + answer); // Print the result
    }
}

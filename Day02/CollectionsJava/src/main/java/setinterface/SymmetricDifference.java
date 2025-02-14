package setinterface;
import java.util.*;

public class SymmetricDifference {

    // This method calculates the symmetric difference of two sets of integers
    public static Set<Integer> difference(Set<Integer> s1, Set<Integer> s2) {
        Set<Integer> diff = new HashSet<>(); // Create a new set to store the symmetric difference

        // Add all elements from the first set
        for (Integer i : s1) {
            diff.add(i);
        }

        // For each element in the second set
        for (Integer j : s2) {
            // If the element is already in the difference set, remove it
            if (diff.contains(j)) {
                diff.remove(j);
            } else {
                // If the element is not in the difference set, add it
                diff.add(j);
            }
        }

        return diff; // Return the symmetric difference set
    }

    public static void main(String args[]) {
        Set<Integer> set1 = new HashSet<>(); // Create the first set and add elements to it
        Set<Integer> set2 = new HashSet<>(); // Create the second set and add elements to it
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set2.add(3);
        set2.add(4);
        set2.add(5);

        // Calculate the symmetric difference of the two sets
        Set<Integer> answer = difference(set1, set2);
        System.out.println("Difference Between Sets: " + answer); // Print the symmetric difference
    }
}

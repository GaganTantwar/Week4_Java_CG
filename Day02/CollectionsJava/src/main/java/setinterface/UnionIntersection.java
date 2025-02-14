package setinterface;
import java.util.*;

public class UnionIntersection {

    // This method calculates the union of two sets of integers
    public static Set<Integer> union(Set<Integer> s1, Set<Integer> s2) {
        Set<Integer> union = new HashSet<>(); // Create a new set to store the union
        for (Integer i : s1) {
            union.add(i); // Add all elements from the first set
        }
        for (Integer j : s2) {
            union.add(j); // Add all elements from the second set
        }
        return union; // Return the union set
    }

    // This method calculates the intersection of two sets of integers, using the union set
    public static Set<Integer> intersection(Set<Integer> s1, Set<Integer> s2, Set<Integer> union) {
        Set<Integer> intersection = new HashSet<>(); // Create a new set to store the intersection
        for (Integer i : union) {
            // If the element is present in both sets, add it to the intersection set
            if (s1.contains(i) && s2.contains(i)) {
                intersection.add(i);
            }
        }
        return intersection; // Return the intersection set
    }

    public static void main(String args[]) {
        Set<Integer> set1 = new HashSet<>(); // Create a new set and add elements to it
        Set<Integer> set2 = new HashSet<>(); // Create another new set and add elements to it
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set2.add(3);
        set2.add(4);
        set2.add(5);

        // Calculate the union of the two sets
        Set<Integer> union = union(set1, set2);
        System.out.println("Union of Two Sets: " + union); // Print the union of the sets

        // Calculate the intersection of the two sets
        Set<Integer> intersection = intersection(set1, set2, union);
        System.out.println("Intersection Of the Two Sets: " + intersection); // Print the intersection of the sets
    }
}

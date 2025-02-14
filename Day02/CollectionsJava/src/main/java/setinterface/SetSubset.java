package setinterface;
import java.util.*;

public class SetSubset {

    // This method checks if a sorted set (s1) is a subset of another sorted set (s2)
    public static boolean checkSubset(SortedSet<Integer> s1, SortedSet<Integer> s2) {
        // Iterate through s2 to find potential subsets of size equal to s1
        for (int i = 0; i < s2.size(); i++) {
            SortedSet<Integer> set = s2.subSet(i, (s1.size() + i)); // Create a subset of s2 from index i to i + s1.size()
            if (set.equals(s1)) { // Check if the subset equals s1
                return true; // Return true if s1 is found as a subset of s2
            }
        }
        return false; // Return false if s1 is not found as a subset of s2
    }

    public static void main(String args[]) {
        // Create two sorted sets and add elements to them
        SortedSet<Integer> set1 = new TreeSet<Integer>();
        SortedSet<Integer> set2 = new TreeSet<Integer>();
        set1.add(2);
        set1.add(3);
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);

        System.out.println("Set 1: " + set1); // Print the first set
        System.out.println("Set 2: " + set2); // Print the second set

        // Check if set1 is a subset of set2
        boolean answer = SetSubset.checkSubset(set1, set2);
        System.out.println("Set1 is Subset Of Set2: " + answer); // Print the result
    }
}

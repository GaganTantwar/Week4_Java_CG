package mapinterface;
import java.util.*;

public class MaximumValue {

    // This method finds the key with the maximum value in a map
    public static char maximum(Map<Character, Integer> map) {
        int max = Integer.MIN_VALUE; // Initialize max with the smallest possible integer value
        char maxKey = '1'; // Initialize maxKey with a default value

        // Iterate through the entries of the map
        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            // If the current entry's value is greater than max, update max and maxKey
            if (e.getValue() > max) {
                max = e.getValue();
                maxKey = e.getKey();
            }
        }
        return maxKey; // Return the key with the maximum value
    }

    public static void main(String args[]) {
        // Create a map with character keys and integer values
        Map<Character, Integer> map = new HashMap<>();
        map.put('A', 6);
        map.put('C', 9);
        map.put('B', 3);
        map.put('E', 5);

        // Find the key with the maximum value in the map
        char answer = MaximumValue.maximum(map);
        System.out.println("Key With Maximum Value: " + answer); // Print the key with the maximum value
    }
}

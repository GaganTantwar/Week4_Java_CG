package mapinterface;
import java.util.*;

public class MergeMaps {

    // This method merges two maps with the same key type K and integer values.
    // If a key exists in both maps, their values are summed.
    public static <K> Map<K, Integer> merge(Map<K, Integer> map1, Map<K, Integer> map2) {
        map2.forEach((key, value) -> map1.merge(key, value, Integer::sum)); // For each key-value pair in map2, merge it into map1
        return map1; // Return the modified map1
    }

    public static void main(String args[]) {
        Map<Character, Integer> map1 = new HashMap<>(); // Create the first map
        Map<Character, Integer> map2 = new HashMap<>(); // Create the second map
        map1.put('A', 1);
        map1.put('B', 2);
        map2.put('A', 2);
        map2.put('C', 3);

        Map<Character, Integer> result = merge(map1, map2); // Merge map1 and map2

        // Print the merged map
        for (Map.Entry<Character, Integer> e : result.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}

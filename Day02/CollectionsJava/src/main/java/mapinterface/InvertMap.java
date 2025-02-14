package mapinterface;
import java.util.*;

public class InvertMap {

    // This method inverts a map where the values are integers and the keys are characters.
    // The resulting map will have integers as keys and lists of characters as values.
    public static Map<Integer, List<Character>> invertMap(Map<Character, Integer> map) {
        Map<Integer, List<Character>> mapInvert = new HashMap<>(); // Create a new map to hold the inverted map

        // Iterate through the original map
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            Integer value = entry.getValue();
            Character key = entry.getKey();

            // If the value is already in the inverted map, add the key to the list
            if (!mapInvert.containsKey(value)) {
                mapInvert.put(value, new ArrayList<>()); // Initialize the list if not already present
            }
            mapInvert.get(value).add(key); // Add the key to the list corresponding to the value
        }

        return mapInvert; // Return the inverted map
    }

    public static void main(String args[]) {
        // Create a map with character keys and integer values
        Map<Character, Integer> map = new HashMap<>();
        map.put('A', 1);
        map.put('B', 2);
        map.put('C', 1);

        // Invert the map
        Map<Integer, List<Character>> res = invertMap(map);

        // Print the inverted map
        for (Map.Entry<Integer, List<Character>> e : res.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }
    }
}

package mapinterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeDeptMap {

    // This method inverts a map where the keys are employees and the values are departments.
    // The resulting map will have departments as keys and lists of employees as values.
    public static <K, V> Map<V, List<K>> employeeDept(Map<K, V> inputMap) {
        Map<V, List<K>> invertedMap = new HashMap<>(); // Create a new map to hold the inverted map

        // Iterate through the original map
        for (Map.Entry<K, V> entry : inputMap.entrySet()) {
            // Use computeIfAbsent to add the key to the list if it does not already exist
            invertedMap.computeIfAbsent(entry.getValue(), k -> new ArrayList<>()).add(entry.getKey());
        }

        return invertedMap; // Return the inverted map
    }

    public static void main(String args[]) {
        // Create a map with employee names as keys and department names as values
        Map<String, String> map = new HashMap<>();
        map.put("Alice", "HR");
        map.put("Bob", "IT");
        map.put("Mark", "Marketing");
        map.put("Chefina", "HR");

        // Invert the map to group employees by department
        Map<String, List<String>> res = employeeDept(map);

        // Print the inverted map
        for (Map.Entry<String, List<String>> e : res.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}

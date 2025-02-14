package listinterface;
import java.util.*;

public class FrequencyFinder {

    // This method counts the frequency of each word in a list of words
    public static Map<String, Integer> countFrequency(List<String> words) {
        Map<String, Integer> counter = new HashMap<>(); // Create a new map to store word frequencies
        for (String word : words) {
            Integer count = counter.get(word); // Get the current count of the word from the map
            counter.put(word, (count == null) ? 1 : count + 1); // If the word is not in the map, add it with a count of 1; otherwise, increment the count
        }
        return counter; // Return the map containing word frequencies
    }

    public static void main(String args[]) {
        List<String> fruits = new ArrayList<>(); // Create a new list to store fruit names
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("banana");

        // Count the frequency of each fruit in the list
        Map<String, Integer> frequency = FrequencyFinder.countFrequency(fruits);

        // Print the frequency of each fruit
        for (Map.Entry<String, Integer> map : frequency.entrySet()) {
            System.out.println(map.getKey() + ": " + map.getValue());
        }
    }
}

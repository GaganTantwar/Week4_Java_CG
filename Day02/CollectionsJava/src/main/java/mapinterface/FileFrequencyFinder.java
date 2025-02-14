package mapinterface;
import java.io.*;
import java.util.*;

public class FileFrequencyFinder {

    // This method reads a file and counts the frequency of each word in the file
    public static Map<String, Integer> frequency(String filepath) {
        Map<String, Integer> map = new HashMap<>(); // Create a map to store word frequencies
        try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
            String line;
            // Read the file line by line
            while ((line = br.readLine()) != null) {
                String[] words = line.split(" "); // Split the line into words
                // Count the frequency of each word
                for (String word : words) {
                    Integer count = map.get(word); // Get the current count of the word from the map
                    map.put(word, (count == null) ? 1 : count + 1); // If the word is not in the map, add it with a count of 1; otherwise, increment the count
                }
            }
        } catch (IOException e) {
            e.printStackTrace(); // Print the stack trace if an IOException occurs
        }
        return map; // Return the map containing word frequencies
    }

    public static void main(String args[]) {
        String filepath = "Sample.txt"; // Specify the path to the file
        // Get the word frequency map for the file
        Map<String, Integer> result = frequency(filepath);

        // Print the word frequencies
        for (Map.Entry<String, Integer> e : result.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }
    }
}

package countinfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class CountWordsInFile {

    // Method to count words in a file and print the top 5 most frequent words
    public boolean countWords(String path) {
        boolean ans = false;
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            // Map to store words and their counts
            Map<String, Integer> map = new HashMap<>();
            String line;

            // Read the file line by line
            while ((line = br.readLine()) != null) {
                // Split the line into words
                String[] words = line.split(" ");
                for (String word : words) {
                    // Get the current count of the word
                    Integer count = map.get(word);
                    // Update the count in the map
                    map.put(word, (count == null) ? 1 : count + 1);
                }
            }

            // Create a list from the entries of the map
            List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(map.entrySet());
            // Sort the list by values in descending order
            sortedEntries.sort(Collections.reverseOrder(Map.Entry.comparingByValue()));

            // Print the top 5 most frequent words
            System.out.println("Top 5 most frequent words:");
            for (int i = 0; i < 5 && i < sortedEntries.size(); i++) {
                System.out.println(sortedEntries.get(i).getKey() + ": " + sortedEntries.get(i).getValue());
            }
            ans = true;
        } catch (IOException e) {
            ans = false;
            e.printStackTrace();
        }
        return ans;
    }

    public static void main(String args[]) {
        // Create an instance of CountWordsInFile
        CountWordsInFile count = new CountWordsInFile();

        // Path to the file to be read
        String path = "LowerCase.txt";
        // Call the countWords method and print the result
        boolean ans = count.countWords(path);
    }
}

package readlargetext;

import java.util.*;
import java.io.*;

public class ReadInput {

    // Method to read a file line by line and print lines containing the word "error"
    public boolean printLine(String path) {
        boolean ans = false;
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            // Read the file line by line
            while ((line = br.readLine()) != null) {
                // Check if the line contains the word "error"
                if (line.contains("error")) {
                    // Print the line if it contains the word "error"
                    System.out.println(line);
                }
            }
            ans = true;
        } catch (IOException e) {
            ans = false;
            e.printStackTrace();
        }
        return ans;
    }

    public static void main(String args[]) {
        // Create an instance of ReadInput
        ReadInput read = new ReadInput();

        // Path to the file to be read
        String path = "LargeText.txt";
        // Call the printLine method to read the file and print lines containing the word "error"
        boolean ans = read.printLine(path);
    }
}

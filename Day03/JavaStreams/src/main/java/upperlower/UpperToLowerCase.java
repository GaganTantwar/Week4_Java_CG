package upperlower;

import java.io.*;

public class UpperToLowerCase {

    // Method to convert uppercase text in a file to lowercase and write to another file
    public boolean upperCaseToLowerCase(String source, String destination) {
        boolean ans = false;
        try (BufferedReader br = new BufferedReader(new FileReader(source));
             BufferedWriter bw = new BufferedWriter(new FileWriter(destination))) {
            String line;
            // Read the file line by line
            while ((line = br.readLine()) != null) {
                // Convert the line to lowercase and write to the output file
                bw.write(line.toLowerCase());
                bw.newLine();
            }
            System.out.println("File Copied To Destination");
            ans = true;
        } catch (IOException e) {
            ans = false;
            e.printStackTrace();
        }
        return ans;
    }

    public static void main(String args[]) {
        // Create an instance of UpperToLowerCase
        UpperToLowerCase buffer = new UpperToLowerCase();

        // Paths to the source and destination files
        String source = "UpperCase.txt";
        String destination = "LowerCase.txt";
        // Call the upperCaseToLowerCase method and print the result
        boolean ans = buffer.upperCaseToLowerCase(source, destination);
        System.out.println(ans);
    }

}

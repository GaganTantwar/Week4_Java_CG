package consolinput;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput {
    // Method to read user input from console and write it to a file
    public void fileWrite() {
        String path = "userinput.txt";
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             FileWriter fl = new FileWriter(path)) {
            String userInput;
            System.out.println("Enter text (type 'exit' to stop):");
            // Read user input until "exit" is typed
            while (!(userInput = br.readLine()).equalsIgnoreCase("exit")) {
                // Write each line of user input to the file
                fl.write(userInput + System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        // Create an instance of UserInput
        UserInput takeInput = new UserInput();

        // Call the fileWrite method to write user input to a file
        takeInput.fileWrite();
    }
}

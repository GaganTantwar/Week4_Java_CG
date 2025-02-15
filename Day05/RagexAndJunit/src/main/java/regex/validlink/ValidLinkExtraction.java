package regex.validlink;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidLinkExtraction {

    // Method to check if the input text contains any valid links
    public static boolean checkLink(String text) {
        boolean ans = false;  // Variable to store the result
        // Regular expression to match HTTP/HTTPS URLs
        String regex = "https?://(www\\.)?[a-zA-Z0-9.-]+(\\.[a-zA-Z]{2,})";
        // Compile the regex pattern
        Pattern pattern = Pattern.compile(regex);
        // Create a matcher to find the pattern in the text
        Matcher matcher = pattern.matcher(text);
        // Iterate through all matches
        while (matcher.find()) {
            ans = true;  // Set the result to true if a match is found
            // Print the matched link
            System.out.println("Link is: " + matcher.group());
        }
        // Print a newline for formatting purposes
        System.out.println(" ");
        return ans;  // Return the result
    }

    // Main method to test the checkLink method
    public static void main(String args[]){
        // Input text containing links
        String text="Visit https://www.google.com and http://example.org for more info.";
        // Call the checkLink method and store the result
        boolean ans=ValidLinkExtraction.checkLink(text);
        // Print whether there was a valid link in the input text
        System.out.println("There Was a Valid Link: "+ans);
    }
}

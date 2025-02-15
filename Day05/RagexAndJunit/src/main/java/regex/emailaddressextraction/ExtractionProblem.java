package regex.emailaddressextraction;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractionProblem {
    // Method to extract and validate email addresses from a given text
    public static boolean emailExtraction(String text) {
        boolean ans = false;

        // Regular expression to match email addresses
        String regex = "[a-zA-Z0-9+_.-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}";

        // Compile the regex pattern
        Pattern pattern = Pattern.compile(regex);

        // Match the pattern with the input text
        Matcher matcher = pattern.matcher(text);

        // Find all matches of email addresses in the text
        while (matcher.find()) {
            ans = true;
            // Print the valid email address
            System.out.println("Email is Valid: " + matcher.group());
        }

        // Return true if at least one valid email address was found, otherwise false
        return ans;
    }

    public static void main(String args[]) {
        // Test the emailExtraction method with a sample text
        boolean ans = ExtractionProblem.emailExtraction("Contact us at support@example.com and info@company.org");
        // Print if there was any valid email found
        System.out.println("Is there any Valid Email: " + ans);
    }
}

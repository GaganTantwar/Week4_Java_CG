package regex.capitalizedwords;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CaptalizedWords {
    // Method to find capitalized words in a given text
    public static boolean findCapitalized(String text) {
        boolean ans = false;

        // Regular expression to match capitalized words
        // A valid capitalized word starts with an uppercase letter followed by one or more lowercase letters
        String regex = "\\b[A-Z][a-z]+\\b";

        // Compile the regex pattern
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // Find all matches of capitalized words in the text
        while (matcher.find()) {
            ans = true;
            // Print the capitalized word
            System.out.print(matcher.group() + ",");
        }

        // Print a newline for formatting
        System.out.println(" ");

        // Return true if at least one capitalized word was found, otherwise false
        return ans;
    }

    public static void main(String args[]) {
        // Test the findCapitalized method with a sample text
        boolean ans = CaptalizedWords.findCapitalized("The Eiffel Tower is in Paris and the Statue of Liberty is in New York.");

        // Print if there was any valid capitalized word found
        System.out.println("Is there any Valid CapitalWord: " + ans);
    }
}

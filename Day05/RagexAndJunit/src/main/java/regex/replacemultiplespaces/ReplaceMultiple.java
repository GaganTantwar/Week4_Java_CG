package regex.replacemultiplespaces;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceMultiple {

    // Method to replace multiple spaces with a single space
    public static String replace(String text){
        boolean ans=false;  // Variable to store the result (not used in this method)
        // Regular expression to match one or more whitespace characters
        String regex="\\s+";
        // Replace all occurrences of the regex pattern with a single space
        String repacedText=text.replaceAll(regex," ");
        return repacedText;  // Return the modified text
    }

    public static void main(String[] args) {
        // Input text containing multiple spaces
        String text = "This    is       an     example   with  multiple    spaces.";
        // Call the replace method and store the result
        String ans=ReplaceMultiple.replace(text);
        // Print the text after replacement
        System.out.println("Text After Replacement: "+ans);
    }
}

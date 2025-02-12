package resumescreeningsystem;
import java.util.*;

// Utility class to handle operations related to JobRole candidates
public class Utility {
    // Static method to display information for all candidates in the list
    public static void getData(List<? extends JobRole> candidates) {
        // Iterate through each candidate in the list
        for (JobRole candidate : candidates) {
            // Display the information for the current candidate
            candidate.displayInfo();
        }
    }
}

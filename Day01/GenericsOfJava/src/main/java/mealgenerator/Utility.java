package mealgenerator;
import java.util.*;

// Utility class to handle operations related to MealPlan members
public class Utility {
    // Static method to display the meal plans of all members in the list
    public static void display(List<? extends MealPlan> members) {
        // Iterate through each member in the list
        for(MealPlan member : members) {
            // Display the meal plan for the current member
            member.displayMeal();
        }
    }
}

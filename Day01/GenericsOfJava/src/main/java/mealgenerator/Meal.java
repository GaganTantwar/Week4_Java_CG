package mealgenerator;
import java.util.*;

// Meal class with a generic type T that extends MealPlan
public class Meal<T extends MealPlan> {
    // List to store members of type T
    List<T> lists = new ArrayList<>();

    // Method to add a member to the list
    public void addMembers(T member) {
        lists.add(member);
    }

    // Method to get the list of members
    public List<T> getList() {
        return lists;
    }
}

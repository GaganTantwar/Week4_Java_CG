package mealgenerator;

// Main class to demonstrate the meal plans
public class MealDisplay {
    public static void main(String[] args) {
        // Create instances of different meal plans with customer names
        MealPlan meal1 = new Vegan("Gagan Tantwar");
        MealPlan meal2 = new Vegetarian("Harshit Patel");
        MealPlan meal3 = new HighProtein("Shubham");
        MealPlan meal4 = new Keto("Raj Srivastav");

        // Create a Meal object to hold the meal plan instances
        Meal<MealPlan> meals = new Meal<>();

        // Add the meal plan instances to the Meal object
        meals.addMembers(meal1);
        meals.addMembers(meal2);
        meals.addMembers(meal3);
        meals.addMembers(meal4);

        // Display the meal plans for all members
        Utility.display(meals.getList());
    }
}

package mealgenerator;

// HighProtein class implements the MealPlan interface
public class HighProtein implements MealPlan {
    // Private member to store the name of the customer
    private String customerName;

    // Constructor to initialize the customer name
    public HighProtein(String customerName) {
        this.customerName = customerName;
    }

    // Override the displayMeal method from the MealPlan interface
    @Override
    public void displayMeal() {
        // Welcome message for the customer
        System.out.println("Hello " + customerName + " Welcome High Protein Diet");
        System.out.println("Diet Plan For High protein ");

        // Meal plan for each day of the week
        System.out.println("Monday");
        System.out.println("BreakFast: Boiled eggs with Cheese" + " | " + "Lunch: Grilled chicken" + " | " + "Dinner: Boiled Meat ");

        System.out.println("Tuesday");
        System.out.println("BreakFast: Omelet with Butter" + " | " + "Lunch: Egg salad " + " | " + "Dinner: Butter Milk and Chicken Fry");

        System.out.println("Wednesday");
        System.out.println("BreakFast: Coconut milk and Salad" + " | " + "Lunch: Fruits and Salad" + " | " + "Dinner: Roasted Fish ");

        System.out.println("Thursday");
        System.out.println("BreakFast: Orange Juice" + " | " + "Lunch: Chicken Curry" + " | " + "Dinner: Grilled Chicken");

        System.out.println("Friday");
        System.out.println("BreakFast: Greek yogurt" + " | " + "Lunch: Cheese rolls" + " | " + "Dinner: Hard-boiled eggs");

        System.out.println("Saturday");
        System.out.println("BreakFast: Boiled Eggs" + " | " + "Lunch: Protein Bar" + " | " + "Dinner: Pork chops");

        System.out.println("Sunday");
        System.out.println("BreakFast: Peanut Butter and Bread" + " | " + "Lunch: Chicken Caesar salad" + " | " + "Dinner: Boiled Meat ");

        // Print a blank line for separation
        System.out.println(" ");
    }
}

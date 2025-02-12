package mealgenerator;

// Keto class implements the MealPlan interface
public class Keto implements MealPlan {
    // Private member to store the name of the customer
    private String customerName;

    // Constructor to initialize the customer name
    public Keto(String customerName) {
        this.customerName = customerName;
    }

    // Override the displayMeal method from the MealPlan interface
    @Override
    public void displayMeal() {
        // Welcome message for the customer
        System.out.println("Hello " + customerName + " Welcome to Keto Diet");
        System.out.println("Diet Plan in Keto ");

        // Meal plan for each day of the week
        System.out.println("Monday");
        System.out.println("BreakFast: Scrambled eggs with spinach & cheese" + " | " + "Lunch: Grilled chicken" + " | " + "Dinner: Salmon with asparagus");

        System.out.println("Tuesday");
        System.out.println("BreakFast: Keto pancakes with sugar-free syrup" + " | " + "Lunch: Egg salad " + " | " + "Dinner: Beef stir-fry with broccoli & coconut oil");

        System.out.println("Wednesday");
        System.out.println("BreakFast: Chia seed pudding with coconut milk" + " | " + "Lunch: Tuna salad with mixed greens and olive oil" + " | " + "Dinner: Grilled chicken");

        System.out.println("Thursday");
        System.out.println("BreakFast: Omelet with cheese" + " | " + "Lunch: Cobb salad with avocado " + " | " + "Dinner: Grilled chicken");

        System.out.println("Friday");
        System.out.println("BreakFast: Greek yogurt" + " | " + "Lunch: Cheese rolls" + " | " + "Dinner: Hard-boiled eggs");

        System.out.println("Saturday");
        System.out.println("BreakFast: Avocado & poached eggs" + " | " + "Lunch: Keto smoothie (almond milk, cocoa, and protein powder)" + " | " + "Dinner: Pork chops");

        System.out.println("Sunday");
        System.out.println("BreakFast: Keto muffins" + " | " + "Lunch: Chicken Caesar salad" + " | " + "Dinner: Baked cod with creamy garlic sauce and spinach");

        // Print a blank line for separation
        System.out.println(" ");
    }
}

package mealgenerator;

// Vegetarian class implements the MealPlan interface
public class Vegetarian implements MealPlan {
    // Private member to store the name of the customer
    private String customerName;

    // Constructor to initialize the customer name
    public Vegetarian(String customerName) {
        this.customerName = customerName;
    }

    // Override the displayMeal method from the MealPlan interface
    @Override
    public void displayMeal() {
        // Welcome message for the customer
        System.out.println("Hello " + customerName + " Welcome Vegetarian Diet");
        System.out.println("Diet Plan For High protein ");

        // Meal plan for each day of the week
        System.out.println("Monday");
        System.out.println("BreakFast: Fruit Juice" + " | " + "Lunch: Grilled Vegetable" + " | " + "Dinner: Salad ");

        System.out.println("Tuesday");
        System.out.println("BreakFast: Butter Milk" + " | " + "Lunch: Paneer Fry" + " | " + "Dinner: Rice Fry");

        System.out.println("Wednesday");
        System.out.println("BreakFast: Coconut milk and salad" + " | " + "Lunch: Fruits and Salad" + " | " + "Dinner: Dal Rice ");

        System.out.println("Thursday");
        System.out.println("BreakFast: Orange Juice" + " | " + "Lunch: Curd Curry" + " | " + "Dinner: Grilled Potato");

        System.out.println("Friday");
        System.out.println("BreakFast: Greek yogurt" + " | " + "Lunch: Cheese rolls" + " | " + "Dinner: Brinjal Fry");

        System.out.println("Saturday");
        System.out.println("BreakFast: Salad" + " | " + "Lunch: Protein Bar" + " | " + "Dinner: Cucumber Salad");

        System.out.println("Sunday");
        System.out.println("BreakFast: Peanut Butter and Bread" + " | " + "Lunch: Fried Lady Finger" + " | " + "Dinner: Grilled Vegetables");

        // Print a blank line for separation
        System.out.println(" ");
    }
}

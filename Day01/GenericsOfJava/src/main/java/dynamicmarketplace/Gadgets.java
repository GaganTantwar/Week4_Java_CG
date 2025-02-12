package dynamicmarketplace;

public class Gadgets extends Product<GadgetCategory> {

    // Constructor to initialize the Gadgets product with its category, name, and price
    public Gadgets(GadgetCategory category, String name, double price) {
        super(category, name, price);
    }

    // Method to display information about the Gadgets product
    @Override
    public void displayInfo() {
        System.out.println("Gadget: " + getName() + ", Price: " + getPrice());  // Display the name and price of the gadget
    }
}

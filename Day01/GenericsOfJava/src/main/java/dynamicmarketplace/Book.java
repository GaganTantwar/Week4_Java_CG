package dynamicmarketplace;

public class Book extends Product<BookCategory> {

    // Constructor to initialize the Books product with its category, name, and price
    public Book(BookCategory category, String name, double price) {
        super(category, name, price);
    }

    // Method to display information about the Books product
    @Override
    public void displayInfo() {
        System.out.println("Book: " + getName() + ", Price: " + getPrice());  // Display the name and price of the book
    }
}
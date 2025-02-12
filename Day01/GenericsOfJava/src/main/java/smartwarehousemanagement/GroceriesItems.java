package smartwarehousemanagement;

public class GroceriesItems extends WarehouseItems{

    private int quantity;
    private boolean availability;
    public GroceriesItems(String itemName,int price,String itemId,int quantity,boolean availability){
        super(itemName,price,itemId);
        this.quantity=quantity;
        this.availability=availability;
    }
    public int getQuantity(){
        return quantity;
    }

    public boolean getAvailability() {
        return availability;
    }
    @Override
    public void displayInfo(){
        System.out.println("Name of the Item: "+getItemName());
        System.out.println("Id of the Item: "+getItemId());
        System.out.println("Price of the Item: "+getPrice());
        System.out.println("Quantity of Groceries Item: "+getQuantity());
        System.out.println("Availability of the Groceries  Item: "+getAvailability());
        System.out.println(" ");

    }
}

package smartwarehousemanagement;

public class FurnitureItem extends WarehouseItems{

    private int quantity;
    private boolean availability;
    public FurnitureItem(String itemName,int price,String itemId,int quantity,boolean availability){
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
        System.out.println("Id of the Itemm: "+getItemId());
        System.out.println("Price of the Item: "+getPrice());
        System.out.println("Quantity of Furniture Item: "+getQuantity());
        System.out.println("Availability of the Furniture Item: "+getAvailability());
        System.out.println(" ");

    }
}

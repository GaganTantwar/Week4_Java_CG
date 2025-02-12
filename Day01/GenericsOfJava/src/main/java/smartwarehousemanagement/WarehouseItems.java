package smartwarehousemanagement;

public abstract class WarehouseItems {
    private String itemName;
    private int price;
    private String itemId;
    public WarehouseItems(String itemName,int price,String itemId){
        this.itemName=itemName;
        this.price=price;
        this.itemId=itemId;
    }
    public String getItemId(){
        return itemId;
    }
    public String getItemName(){
        return itemName;
    }
    public int getPrice(){
        return price;
    }
    abstract void displayInfo();
}


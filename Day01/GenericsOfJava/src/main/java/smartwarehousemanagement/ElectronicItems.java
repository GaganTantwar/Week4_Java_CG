package smartwarehousemanagement;

public class ElectronicItems extends WarehouseItems {
    private String type;
    private String batterySize;
    private boolean availability;
    public ElectronicItems(String itemName,int price,String itemId,String type,String batterySize,boolean availability){
        super(itemName,price,itemId);
        this.type=type;
        this.batterySize=batterySize;
        this.availability=availability;
    }
    public String getType(){
        return type;
    }

    public String getBatterySize() {
        return batterySize;
    }
    public boolean getAvailability(){
        return availability;
    }
    @Override
    public void displayInfo(){
        System.out.println("Name of the Item: "+getItemName());
        System.out.println("Id of the Itemm: "+getItemId());
        System.out.println("Price of the Item: "+getPrice());
        System.out.println("Type of Electronic Item: "+getType());
        System.out.println("Battery Size of the Electronic Item: "+getBatterySize());
        System.out.println("Availability of the Electronic Item: "+getAvailability());
        System.out.println(" ");

    }

}

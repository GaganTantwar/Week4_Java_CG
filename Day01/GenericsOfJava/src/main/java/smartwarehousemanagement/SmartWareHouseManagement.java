package smartwarehousemanagement;

public class SmartWareHouseManagement {
    public static void main(String args[]){
        WarehouseItems iphone=new ElectronicItems("Apple IPhone 16",120000,"EID201","Phone","5000mh",true);
        WarehouseItems soap=new GroceriesItems("Dettol",20,"GID342",6,true);
        WarehouseItems bed=new FurnitureItem("Double Bed",15000,"FID567",2,true);
        Storage<WarehouseItems> itemList=new Storage<>();
        itemList.addItems(iphone);
        itemList.addItems(soap);
        itemList.addItems(bed);
        Utility.displayDetails(itemList.getList());

    }


}

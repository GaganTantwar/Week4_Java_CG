package smartwarehousemanagement;
import java.util.*;
public class Utility {
    public static void displayDetails(List<? extends WarehouseItems> items){
        for(WarehouseItems item:items){
            item.displayInfo();
        }
    }
}

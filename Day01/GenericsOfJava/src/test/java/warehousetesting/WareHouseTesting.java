package warehousetesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import smartwarehousemanagement.ElectronicItems;
import smartwarehousemanagement.FurnitureItem;
import smartwarehousemanagement.GroceriesItems;

public class WareHouseTesting {

    @Test
    public void checkFurniture(){
        // Create a new FurnitureItem object named chair
        FurnitureItem chair = new FurnitureItem("Chair", 500, "FID56", 60, true);
        // Check the availability of the chair
        boolean ans = chair.getAvailability();
        // Get the name of the chair item
        String name = chair.getItemName();
        // Assert that the chair is available
        Assertions.assertEquals(true, ans);
        // Assert that the name of the item is "Chair"
        Assertions.assertEquals("Chair", name);
        System.out.println("Testing Pass");
    }

    @Test
    public void checkElectronic(){
        // Create a new ElectronicItems object named laptop
        ElectronicItems laptop = new ElectronicItems("Lenovo Legion", 200000, "EID90", "Laptop", "60000mh", true);
        // Check the availability of the laptop
        boolean ans = laptop.getAvailability();
        // Get the ID of the laptop item
        String id = laptop.getItemId();
        // Assert that the laptop is available
        Assertions.assertEquals(true, ans);
        // Assert that the ID of the item is "EID90"
        Assertions.assertEquals("EID90", id);
        System.out.println("Testing Pass");
    }

    @Test
    public void checkGroceries(){
        // Create a new GroceriesItems object named soap
        GroceriesItems soap = new GroceriesItems("Dettol", 20, "GID80", 6, false);
        // Check the availability of the soap
        boolean ans = soap.getAvailability();
        // Get the ID of the soap item
        String id = soap.getItemId();
        // Assert that the soap is not available
        Assertions.assertNotEquals(true, ans);
        // Assert that the ID of the item is "GID80"
        Assertions.assertEquals("GID80", id);
        System.out.println("Testing Pass");
    }
}

package smartwarehousemanagement;

import java.util.*;

public class Storage <T extends WarehouseItems>{
    public List<T> items=new ArrayList<>();
    public void addItems(T item){
       items.add(item);
    }
    public List<T> getList(){
        return items;
    }
}

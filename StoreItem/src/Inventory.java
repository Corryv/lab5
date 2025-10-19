import java.util.ArrayList;
import java.util.List;

// ALL THE METHODS IN THIS FILE USE POLYMORPHISM

// Interface Template
public class Inventory implements InventoryInterface{

    // Initialized as ArrayList
    private List<StoreItem> storeInventory = new ArrayList<>();

    // method templates to use for interface

    public void displayInventory(){
        System.out.printf("Displaying Inventory%n");
        for (StoreItem item : storeInventory){

            System.out.printf("Item: %s%n", item);
        }
    return;
    }
    public void sell(StoreItem item, int quantity){}
    public void add (StoreItem item,int quantity){
        storeInventory.add(item);
    }

}

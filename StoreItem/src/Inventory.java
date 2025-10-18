import java.util.ArrayList;
import java.util.List;

// Interface Template
public class Inventory implements InventoryInterface{

    // storeInventory initialized as ArrayList
    private List<StoreItem> storeInventory = new ArrayList<>();

    // method templates to use for interface
    public String displayInventory(){return "";}
    public void sell(StoreItem item, int quantity){}
    public void add (StoreItem item,int quantity){}

}

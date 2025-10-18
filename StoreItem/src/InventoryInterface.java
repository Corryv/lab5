public interface InventoryInterface {
    // interface for inventory
    String displayInventory();
    void sell(StoreItem item, int quantity);
    void add(StoreItem item, int quantity);
}

public interface InventoryInterface {
    // interface for inventory
    void displayInventory();
    void sell(StoreItem item, int quantity);
    void add(StoreItem item, int quantity);
}

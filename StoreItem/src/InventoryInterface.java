public interface InventoryInterface {

    /**
     * Sells a specific quantity of an item.
     *
     */
    void sellItems();

    /**
     * Adds stock to an existing item or creates a new one.
     */
    void addItem(int Category);

    /**
     * Adds a new unique item to the inventory.
     */
    void addNew(int Category);
}
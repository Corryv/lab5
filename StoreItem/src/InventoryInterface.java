/**
 * InventoryInterface defines the core operations for managing a store's inventory.
 * It serves as the blueprint for Inventory classes and ensures consistent functionality
 * across different inventory types.
 */
public interface InventoryInterface {

    /** Displays the entire inventory. */
    void displayInventory();

    /**
     * Displays inventory for a specific category.
     * @param category the category number to display
     */
    void displayCategoryInventory(int category);

    /**
     * Sells a specific quantity of an item from the inventory.
     */
    void sellItems();

    /**
     * Adds stock to an existing item or allows creation of a new one.
     * @param category the category number where the item belongs
     */
    void addItem(int category);

    /**
     * Adds a brand-new unique item to the inventory.
     * @param category the category number under which to add the new item
     */
    void addNew(int category);
}
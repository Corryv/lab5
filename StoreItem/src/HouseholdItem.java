/**
 * HouseholdItem represents household products in the store inventory.
 * This abstract class extends StoreItem and adds household-specific attributes such as material composition.
 */
public class HouseholdItem extends StoreItem {
    // attributes
    private String material;

    /**
     * Constructs a HouseholdItem with specified attributes.
     *
     * @param name The name of the household item
     * @param brand The brand of the household item
     * @param price The price of the household item (must be non-negative)
     * @param quantity The quantity in stock (must be non-negative)
     * @param material The material composition of the item (e.g., Plastic, Wood, Metal)
     */
    HouseholdItem(String name, String brand, double price, int quantity, String material) {
        super(name, brand, price, quantity);
        this.material = material;
    }

    //getter and setter
    public String getMaterial(){return this.material;}
    public void setMaterial(String material){this.material = material;}

    //toString override
    @Override
    public String toString(){
        return String.format("Product Name: %s Brand: %s Price %,.2f Quantity %d" +
                        " Material: %s",
                getName(), getBrand(), getPrice(), getQuantity(),
                getMaterial());
    }
}


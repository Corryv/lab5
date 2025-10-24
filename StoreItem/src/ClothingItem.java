/**
 * ClothingItem represents clothing products in the store inventory.
 * This abstract class extends StoreItem and adds clothing-specific attributes
 * such as size, color, and material composition.
 */
 public class ClothingItem extends StoreItem{
    // attributes
    private String size;
    private String color;
    private String material;

    /**
     * Constructs a ClothingItem with specified attributes.
     *
     * @param name The name of the clothing item
     * @param brand The brand of the clothing item
     * @param price The price of the clothing item (must be non-negative)
     * @param quantity The quantity in stock (must be non-negative)
     * @param size The size of the item (e.g., S, M, L, XL)
     * @param color The color of the item
     * @param material The material composition (e.g., Cotton, Polyester)
     */
    ClothingItem(String name, String brand, double price, int quantity, String size, String color, String material) {
        super(name, brand, price, quantity);
        this.size = size;
        this.color = color;
        this.material = material;
    }

    // Getters
    public String getSize() {return this.size;}
    public String getColor() {return this.color;}
    public String getMaterial() {return this.material;}

    // Setters
    public void setSize(String size) {
        this.size = size;
    }
    public void setColor() {
        this.color = color;
    }
    public void setMaterial(){
        this.material = material;
    }

    @Override
    public String toString() {
        return String.format("Product Name: %s Brand: %s Price: $%.2f Quantity: %d Size: %s Color: %s Material %s",
        getName(), getBrand(), getPrice(), getQuantity(), getSize(), getColor(), getMaterial());
    }
}

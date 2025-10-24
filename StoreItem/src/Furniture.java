/**
 * The Furniture class is a HouseholdItem which is an extension of StoreItem.
 * Furniture extends the HouseholdItem class by adding additional attributes that describe
 * Furniture such as dimensions
 */
public class Furniture extends HouseholdItem{
    // Attribute
    private String dimensions;

    /**
     * Constructs a new Furniture object with the specified attributes.
     *
     * @param name the name of the furniture item
     * @param brand the manufacturer or brand of the furniture
     * @param price the price of the furniture item
     * @param quantity the number of furniture items in stock
     * @param material the material the furniture is made of (e.g., wood, metal, plastic)
     * @param dimensions the dimensions of the furniture ("6ft x 3f", "Love seat")
     */
    Furniture(String name, String brand, double price, int quantity, String material, String dimensions){
        super(name, brand, price, quantity, material);
        this.dimensions = dimensions;
    }

    // Getter
    public String getDimensions() {return this.dimensions;}

    // Setter
    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    @Override
    public String toString() {
        return String.format("Product Name: %s Brand: %s Price %,.2f Quantity %d Material: %s Dimensions: %s",
                getName(), getBrand(), getPrice(), getQuantity(), getMaterial(), getDimensions());
    }
}

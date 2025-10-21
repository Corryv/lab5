public class Furniture extends HouseholdItem{
    // Attribute
    private String dimensions;

    // Constructor
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

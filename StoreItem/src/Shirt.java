/**
 * The Shirt class is a clothing item which is an extension of StoreItem.
 * Shirt extends the clothing class by adding additional attributes that describe
 * a Shirt's physical properties such as fit.
 */
public class Shirt extends ClothingItem{
    // Attribute
    String fit;

    /**
     * Constructs a new Shirt object with the specified attributes.
     *
     * @param name the name of the shirt
     * @param brand the manufacturer or brand of the shirt
     * @param price the price of the shirt
     * @param quantity the number of shirts in stock
     * @param size the size of the shirt
     * @param color the color of the shirt
     * @param material the material the shirt is made of
     * @param fit the fit type of the shirt (e.g., slim, regular, loose)
     */
    Shirt(String name, String brand, double price, int quantity, String size, String color, String material, String fit){
        super(name, brand, price, quantity, size, color, material);
        this.fit = fit;
    }

    // Getter
    public String getFit() {return this.fit;}

    // Setter
    public void setFit(String fit) {
        this.fit = fit;
    }

    @Override
    public String toString() {
        return String.format("Product Name: %s Brand: %s Price: $%.2f Quantity: %d Size: %s Color: %s Material %s Fit: %s",
                getName(), getBrand(), getPrice(), getQuantity(), getSize(), getColor(), getMaterial(), getFit());
    }
}

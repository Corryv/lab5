/**
 * The Shoe class is a clothing item which is an extension of StoreItem.
 * Shoe extends the ClothingItem class by adding additional attributes that describe
 * a shoe's physical properties such as style.
 */

public class Shoe extends ClothingItem{
    // Attribute
    private String style;

    /**
     * Constructs a new Shoe object with the specified attributes.
     * @param name the name of the shoe
     * @param brand the manufacturer or brand of the shoe
     * @param price the price of the shoe
     * @param quantity the number of shoes in stock
     * @param size the size of the shoe
     * @param color the color of the shoe
     * @param material the material the shoe is made of
     * @param style the style or type of the shoe ( running, casual, formal, etc.)
     */
    Shoe(String name, String brand, double price, int quantity, String size, String color, String material, String style){
        super(name, brand, price, quantity, size, color, material);
        this.style = style;
    }

    // Getter
    public String getStyle() {return this.style;}

    // Setter
    public void setStyle(String style) {
        this.style = style;
    }

    @Override
    public String toString() {
        return String.format("Product Name: %s Brand: %s Price: $%.2f Quantity: %d Size: %s Color: %s Material %s Style: %s",
                getName(), getBrand(), getPrice(), getQuantity(), getSize(), getColor(), getMaterial(),getStyle());
    }
}

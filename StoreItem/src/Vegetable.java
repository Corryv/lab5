/**
 * The vegetable class is a FoodItem which is an extension of StoreItem
 * Vegetable extends the FoodItem class by adding additional attributes that describe
 * a vegetable's physical properties such as texture and color.
 */

public class Vegetable extends FoodItem{
    // Attributes
    private String texture;
    private String color;

    /**
     * Constructs a new Vegetable object with the specified attributes.
     *
     * @param name the name of the vegetable
     * @param brand the brand or source of the vegetable
     * @param price the price per unit of the vegetable
     * @param quantity the number of items in stock
     * @param expirationDate the expiration date in MM/DD/YYYY format
     * @param organic whether the vegetable is organic
     * @param texture a description of the vegetable's texture
     * @param color the color of the vegetable
     */
    Vegetable(String name, String brand, double price, int quantity, String expirationDate, boolean organic, String texture, String color){
        super(name, brand, price, quantity, expirationDate, organic);
        this.texture = texture;
        this.color = color;
    }

    // Getter
    public String getTexture() {return this.texture;}
    public String getColor() {return this.color;}

    // Setter
    public void setTexture(String texture){
        this.texture = texture;
    }
    public void setColor(String color){
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("Product Name: %s Brand: %s Price: $%.2f Quantity: %d Expiration Date: %s Organic: %b Texture: %s Color: %s",
                getName(), getBrand(), getPrice(), getQuantity(), getExpirationDate(), getOrganic(), getTexture(), getColor());
    }
}

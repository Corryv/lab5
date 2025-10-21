public class Vegetable extends FoodItem{
    // Attribute
    private String texture;
    private String color;

    // Constructor
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

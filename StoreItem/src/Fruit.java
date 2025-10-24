/**
 * The Fruit class is a FoodItem which is an extension of StoreItem.
 * Fruit extends the FoodItem class by adding additional attributes that describe a
 * Fruit such as color
 */
public class Fruit extends FoodItem{
    // Attributes
    private String color;

    /**
     * Constructs a new Fruit object with the specified attributes.
     *
     * @param name the name of the fruit
     * @param brand the brand or supplier of the fruit
     * @param price the price of the fruit
     * @param quantity the number of fruit items in stock
     * @param expirationDate the expiration date of the fruit in MM/DD/YYYY format
     * @param organic whether the fruit is organic
     * @param color the color of the fruit
     */
    Fruit(String name, String brand, double price, int quantity, String expirationDate, boolean organic, String color){
        super(name, brand, price, quantity, expirationDate, organic);
        this.color = color;
    }

    // Getter
    public String getColor() {return this.color;}

    // Setter
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString(){
        return String.format("Product Name: %s Brand: %s Price: $%.2f Quantity: %d Expiration Date: %s Organic: %b Color: %s",
                getName(), getBrand(), getPrice(), getQuantity(), getExpirationDate(), getOrganic(), getColor());
    }
}

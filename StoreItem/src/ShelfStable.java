/**
 * The ShelfStable class is a FoodItem which is an extension of StoreItem
 * ShelfStable extends the FoodItem class by adding additional attributes that describe
 * a vegetable's physical properties such as shelfLIfe.
 */

public class ShelfStable extends FoodItem{
    // Attributes
    private String shelfLife;

    /**
     * Constructs a new ShelfStable object with the specified attributes.
     *
     * @param name the name of the shelf-stable food item
     * @param brand the manufacturer or brand of the item
     * @param price the price of the item
     * @param quantity the number of items in stock
     * @param expirationDate the expiration date of the item in MM/DD/YYYY format
     * @param organic whether the item is organic
     * @param shelfLife the estimated shelf life of the product (e.g., "2 years", "18 months")
     */
    ShelfStable(String name, String brand, double price, int quantity, String expirationDate, boolean organic, String shelfLife){
        super(name, brand, price, quantity, expirationDate, organic);
        this.shelfLife = shelfLife;
    }

    // Getter
    public String getShelfLife() {return this.shelfLife;}

    // Setter
    public void setShelfLife(String shelfLife){
        this.shelfLife = shelfLife;
    }

    @Override
    public String toString(){
        return String.format("Product Name: %s Brand: %s Price: $%.2f Quantity: %d Expiration Date: %s Organic: %b Shelf Life: %s",
                getName(), getBrand(), getPrice(), getQuantity(), getExpirationDate(), getOrganic(), getShelfLife());
    }
}

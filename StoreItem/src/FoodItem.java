/**
 * FoodItem represents food products in the store inventory.
 * This abstract class extends StoreItem and adds food-specific attributes such as expiration date and organic status.
 */
public class FoodItem extends StoreItem {

    // attributes
    private String expirationDate;
    private boolean organic;

    /**
    * Constructs a FoodItem with specified attributes.
    * Validates that expiration date follows MM/DD/YYYY format.
    *
    * @param name The name of the food item
    * @param brand The brand of the food item
    * @param price The price of the food item (must be non-negative)
    * @param quantity The quantity in stock (must be non-negative)
    * @param expirationDate The expiration date in MM/DD/YYYY format
    * @param organic True if the item is organic, false otherwise
    * @throws IllegalArgumentException if expiration date format is invalid
    */
    FoodItem(String name, String brand, double price, int quantity, String expirationDate, boolean organic) {
        super(name, brand, price, quantity);
        if (expirationDate.length() != 10 || expirationDate.charAt(2) != '/' || expirationDate.charAt(5) != '/') {
            throw new IllegalArgumentException("Expiration date should be in XX/XX/XXXX format.");
        }
        this.expirationDate = expirationDate;
        this.organic = organic;
    }
    //getters and setters
    public String getExpirationDate() {return expirationDate;}
    public boolean getOrganic() {return organic;}
    public void setExpirationDate(String expirationDate){
        this.expirationDate = expirationDate;
    }
    public void setOrganic(boolean organic){
        this.organic = organic;
    }

    @Override
    public String toString(){
        return String.format("Product Name: %s Brand: %s Price %,.2f Quantity %d" +
                              " Expiration Date: %s Oraganic: %b",
                getName(), getBrand(), getPrice(), getQuantity(),
                getExpirationDate(), getOrganic());
    }
}

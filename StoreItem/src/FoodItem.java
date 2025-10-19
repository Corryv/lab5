public class FoodItem extends StoreItem {

    // attributes
    private String expirationDate;
    private boolean organic;

    // constructor
    FoodItem(String name, String brand, double price, int quantity, String expirationDate, boolean organic) {
        super(name, brand, price, quantity);
        this.expirationDate = expirationDate;
        this.organic = organic;

        // Checks/Err Handling for expiration date and organic?

    }
    //getters and setters
    public String getExpirationDate() {return expirationDate;}
    public boolean getOrganic() {return organic;}
    public void setExpirationDate(String expirationDate){}
    public void setOrganic(boolean organic){}

    @Override
    public String toString(){
        return String.format("Product Name: %s Brand: %s Price %,.2f Quantity %d" +
                              " Expiration Date: %s, Oraganic: %b",
                getName(), getBrand(), getPrice(), getQuantity(),
                getExpirationDate(), getOrganic());
    }
}

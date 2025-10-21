public class ShelfStable extends FoodItem{
    // Attributes
    private String shelfLife;

    // Constructor
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

public class Fruit extends FoodItem{
    // Attributes
    private String color;

    // Constructor
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

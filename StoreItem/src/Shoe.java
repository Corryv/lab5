public class Shoe extends ClothingItem{
    // Attribute
    private String style;

    // Constructor
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

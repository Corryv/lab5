public class Shirt extends ClothingItem{
    // Attribute
    String fit;

    // Constructor
    Shirt(String name, String brand, double price, int quantity, String size, String color, String material, String fit){
        super(name, brand, price, quantity, size, color, material);
        this.fit = fit;
    }

    // Getter
    public String getFit() {return this.fit;}

    // Setter
    public void setFit(String fit) {
        this.fit = fit;
    }

    @Override
    public String toString() {
        return String.format("Product Name: %s Brand: %s Price: $%.2f Quantity: %d Size: %s Color: %s Material %s Fit: %s",
                getName(), getBrand(), getPrice(), getQuantity(), getSize(), getColor(), getMaterial(), getFit());
    }
}

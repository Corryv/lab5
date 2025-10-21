public class Outerwear extends ClothingItem{
    // Attribute
    private String type;

    // Constructor
    Outerwear(String name, String brand, double price, int quantity, String size, String color, String material, String type){
        super(name, brand, price, quantity, size, color, material);
        this.type = type;
    }

    // Getter
    public String getType() {return this.type;}

    // Setter
    public void setType(String type){
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("Product Name: %s Brand: %s Price: $%.2f Quantity: %d Size: %s Color: %s Material %s Type: %s",
                getName(), getBrand(), getPrice(), getQuantity(), getSize(), getColor(), getMaterial(), getType());
    }
}

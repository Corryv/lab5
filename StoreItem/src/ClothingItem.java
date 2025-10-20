public class ClothingItem extends StoreItem{
    // attributes
    private String size;
    private String color;
    private String material;

    // Constructor
    ClothingItem(String name, String brand, double price, int quantity, String size, String color, String material) {
        super(name, brand, price, quantity);
        this.size = size;
        this.color = color;
        this.material = material;
    }

    // Getters
    public String getSize() {return this.size;}
    public String getColor() {return this.color;}
    public String getMaterial() {return this.material;}

    // Setters
    public void setSize(String size) {
        this.size = size;
    }
    public void setColor() {
        this.color = color;
    }
    public void setMaterial(){
        this.material = material;
    }

    @Override
    public String toString() {
        return String.format("Product Name: %s Brand: %s Price: $%.2f Quantity: %d Size: %s Color: %s Material %s",
        getName(), getBrand(), getPrice(), getQuantity(), this.size, this.color, this.material);
    }
}

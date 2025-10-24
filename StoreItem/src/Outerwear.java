/**
 * The Outerwear class is a ClothingItem which is an extension of StoreItem.
 * Outerwear extends the ElectronicItem class by adding additional attributes that describe
 * Outerwear such as processor and ramGG
 */
public class Outerwear extends ClothingItem{
    // Attribute
    private String type;

    /**
     * Constructs a new Outerwear object with the specified attributes.
     *
     * @param name the name of the outerwear item
     * @param brand the manufacturer or brand of the outerwear
     * @param price the price of the outerwear item
     * @param quantity the number of outerwear items in stock
     * @param size the size of the outerwear item
     * @param color the color of the outerwear item
     * @param material the material the outerwear is made of
     * @param type the type of outerwear (e.g., jacket, coat, hoodie)
     */
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

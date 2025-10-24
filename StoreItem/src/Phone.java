/**
 * The Phone class is an electronic item which is an extension of StoreItem.
 * Phone extends the ElectronicItem class by adding additional attributes that describe a
 * Phone such as madel and storageGB
 */
public class Phone extends ElectronicItem{
    // Attributes
    private String model;
    private int storageGB;

    /**
     * Constructs a new Phone object with the specified attributes.
     *
     * @param name the name of the phone
     * @param brand the manufacturer or brand of the phone
     * @param price the price of the phone
     * @param quantity the number of phones in stock
     * @param warrantyMonths the warranty period in months
     * @param model the model name or number of the phone
     * @param storageGB the internal storage capacity of the phone in gigabytes
     */
    Phone(String name, String brand, double price, int quantity, int warrantyMonths, String model, int storageGB){
        super(name, brand, price, quantity, warrantyMonths);
        this.model = model;
        this.storageGB= storageGB;
    }

    // Getters
    public String getModel() {return this.model;}
    public int getStorageGB() {return this.storageGB;}

    // Setters
    public void setModel(String model) {this.model = model;}
    public void setStorageGB(int storageGB) {this.storageGB = storageGB;}

    @Override
    public String toString(){
        return String.format("Product Name: %s Brand: %s Price: $%.2f Quantity: %d Warranty(in Months): %d Model: %s Storage(GB): %d",
                getName(), getBrand(), getPrice(), getQuantity(), getWarrantyMonths(), getModel(), getStorageGB());
    }
}

public class Phone extends ElectronicItem{
    // Attributes
    private String model;
    private int storageGB;

    // Constructor
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

public class TV extends ElectronicItem{
    // Attributes
    private int screenSize;
    private String resolution;
    private boolean smartTV;

    // Constructor
    TV(String name, String brand, double price, int quantity, int warrantyMonths, int screenSize, String resolution, boolean smartTV) {
        super(name, brand, price, quantity, warrantyMonths);
        this.screenSize = screenSize;
        this.resolution = resolution;
        this.smartTV = smartTV;
    }

    // Getters
    public int getScreenSize(){return this.screenSize;}
    public String getResolution() {return this.resolution;}
    public boolean getSmartTV() {return this.smartTV;}

    // Setters
    public void setScreenSize(int screenSize){this.screenSize = screenSize;}
    public void setResolution(String resolution) {this.resolution = resolution;}
    public void setSmartTV(boolean smartTV) {this.smartTV = smartTV;}

    @Override
    public String toString(){
        return String.format("Product Name: %s Brand: %s Price: $%.2f Quantity: %d Warranty(in Months): %d screenSize(diagonally): %d Resolution: %s smartTV: %b",
                getName(), getBrand(), getPrice(), getQuantity(), getWarrantyMonths(), getScreenSize(), getResolution(), getSmartTV());
    }
}

/**
 * The TV class is an electronic item which is an extension of StoreItem.
 * TV extends the ElectronicItem class by adding additional attributes that describe a
 * TV such as screen size resolution, and smartTv.
 */

public class TV extends ElectronicItem{
    // Attributes
    private int screenSize;
    private String resolution;
    private boolean smartTV;

    /**
     * Constructs a new TV object with the specified attributes.
     *
     * @param name the name of the TV
     * @param brand the manufacturer or brand of the TV
     * @param price the price of the TV
     * @param quantity the number of TVs in stock
     * @param warrantyMonths the warranty period in months
     * @param screenSize the screen size of the TV in inches
     * @param resolution the display resolution of the TV
     * @param smartTV whether the TV has smart capabilities
     */
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

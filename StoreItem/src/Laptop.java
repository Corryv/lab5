/**
 * The Laptop class is an electronic item which is an extension of StoreItem.
 * Laptop extends the ElectronicItem class by adding additional attributes that describe a
 * Laptop such as processor and ramGG
 */
public class Laptop extends ElectronicItem{
    // Attributes
    private String processor;
    private int ramGG;

    /**
     * Constructs a new Laptop object with the specified attributes.
     *
     * @param name the name of the laptop
     * @param brand the manufacturer or brand of the laptop
     * @param price the price of the laptop
     * @param quantity the number of laptops in stock
     * @param warrantyMonths the warranty period in months
     * @param processor the processor model or type used in the laptop
     * @param ramGG the amount of RAM in the laptop, measured in gigabytes
     */
    // Constructor
    Laptop(String name, String brand, double price, int quantity, int warrantyMonths, String processor, int ramGG){
        super(name, brand, price, quantity, warrantyMonths);
        this.processor = processor;
        this.ramGG = ramGG;
    }

    // Getter
    public String getProcessor() {return this.processor;}
    public int getRamGG() {return this.ramGG;}

    // Setters
    public void setProcessor(String processor) {this.processor = processor;}
    public void setRamGG(int ramGG) {this.ramGG = ramGG;}

    @Override
    public String toString(){
        return String.format("Product Name: %s Brand: %s Price: $%.2f Quantity: %d Warranty(in Months): %d Processor: %s Ram(GB): %d",
                getName(), getBrand(), getPrice(), getQuantity(), getWarrantyMonths(), getProcessor(), getRamGG());
    }
}

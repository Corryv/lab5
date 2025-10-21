public class Laptop extends ElectronicItem{
    // Attributes
    private String processor;
    private int ramGG;

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

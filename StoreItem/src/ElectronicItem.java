public class ElectronicItem extends StoreItem{
    // Attributes
    private int warrantyMonths;

    // Constructor
    ElectronicItem(String name, String brand, double price, int quantity, int warrantyMonths){
        super(name, brand, price, quantity);
        this.warrantyMonths = warrantyMonths;
    }

    // Getter
    public int getWarrantyMonths() {return this.warrantyMonths;}

    // Accessor
    public void setWarrantyMonths(int warrantyMonths){
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public String toString(){
        return String.format("Product Name: %s Brand: %s Price: $%.2f Quantity: %d Warranty(in Months): %d",
                getName(), getBrand(), getPrice(), getQuantity(), getWarrantyMonths());
    }
}

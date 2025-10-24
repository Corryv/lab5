/**
 * ElectronicItem represents electronic products in the store inventory.
 * This abstract class extends StoreItem and adds electronics-specific attributes
 * such as warranty information.
 */

 public class ElectronicItem extends StoreItem{
    // Attributes
    private int warrantyMonths;

    /**
     * Constructs an ElectronicItem with specified attributes.
     *
     * @param name The name of the electronic item
     * @param brand The brand of the electronic item
     * @param price The price of the electronic item (must be non-negative)
     * @param quantity The quantity in stock (must be non-negative)
     * @param warrantyMonths The warranty period in months
     */
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

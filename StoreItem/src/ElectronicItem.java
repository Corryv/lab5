public class ElectronicItem extends StoreItem{
    // Attributes
    private int warrantyMonths;

    // Constructor
    ElectronicItem(String name, String brand, double price, int quantity, int warrantyMonths){
        super(name, brand, price, quantity);
        this.warrantyMonths = warrantyMonths;
    }
}

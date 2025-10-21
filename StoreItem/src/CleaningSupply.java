public class CleaningSupply extends HouseholdItem{
    // Attribute
    private boolean containsBleach;

    // Constructor
    CleaningSupply(String name, String brand, double price, int quantity, String material, boolean containsBleach){
        super(name, brand, price, quantity, material);
        this.containsBleach = containsBleach;
    }

    // Getter
    public boolean getContainsBleach() {return this.containsBleach;}

    // Setter
    public void setContainsBleach(boolean containsBleach){
        this.containsBleach = containsBleach;
    }

    @Override
    public String toString() {
        return String.format("Product Name: %s Brand: %s Price %,.2f Quantity %d Material: %s Product has bleach: %b",
                getName(), getBrand(), getPrice(), getQuantity(), getMaterial(), getContainsBleach());
    }
}

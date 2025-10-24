/**
 * The CleaningSupply class is a HouseholdItem  which is an extension of StoreItem.
 * CleaningSupply extends the HouseholdItem class by adding additional attributes that describe
 * CleaningSupply such containsBleach.
 */
public class CleaningSupply extends HouseholdItem{
    // Attribute
    private boolean containsBleach;

    /**
     * Constructs a new CleaningSupply object with the specified attributes.
     *
     * @param name the name of the cleaning supply item
     * @param brand the manufacturer or brand of the cleaning supply
     * @param price the price of the cleaning supply item
     * @param quantity the number of cleaning supply items in stock
     * @param material the primary material or chemical base of the cleaning supply
     * @param containsBleach whether the cleaning supply contains bleach
     */
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

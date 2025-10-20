public class HouseholdItem extends StoreItem {
    // attributes
    private String material;

    //constructor
    HouseholdItem(String name, String brand, double price, int quantity, String material) {
        super(name, brand, price, quantity);
        this.material = material;
    }

    //getter and setter
    public String getMaterial(){return this.material;}
    public void setMaterial(String material){this.material = material;}

    //toString override
    @Override
    public String toString(){
        return String.format("Product Name: %s Brand: %s Price %,.2f Quantity %d" +
                        " Material: %s",
                getName(), getBrand(), getPrice(), getQuantity(),
                getMaterial());
    }
}


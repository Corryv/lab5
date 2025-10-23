public abstract class StoreItem {
    // Attributes
    private String name;
    private String brand;
    private double price;
    private int quantity;

    // Constructor
    StoreItem(String name, String brand, double price, int quantity) {
        // Error Handling for price and quantity
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative.");
        }
        try {
            quantity = Integer.parseInt(String.valueOf(quantity));
            if (quantity < 0) {
                throw new IllegalArgumentException("Quantity must be a positive integer.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Quantity must be a numeric value.");
            return; // or loop again for re-entry
        }

        this.name = name;
        this.brand = brand;
        this.price = price;
        this.quantity = quantity;


    }
        // getters and setters\
        public String getName () {
            return this.name;
        }
        public String getBrand () {
            return this.brand;
        }
        public double getPrice () {
            return this.price;
        }
        public int getQuantity () {
            return this.quantity;
        }

        public void setName (String name){
            this.name = name;
        }
        public void setBrand (String brand){
            this.brand = brand;
        }
        public void setPrice ( double price){
            this.price = price;
        }
        public void setQuantity ( int quantity){
            this.quantity = quantity;
        }

        @Override
        public String toString () {
            return String.format("Product Name: %s Brand: %s Price %,.2f Quantity %d",
                    getName(), getBrand(), getPrice(), getQuantity());
        }

}


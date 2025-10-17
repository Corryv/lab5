public abstract class StoreItem {
    // Attributes
    private String name;
    private String brand;
    private double price;
    private int quantity;

    // Constructor
    public StoreItem(String name, String brand, double price, int quantity){
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.quantity = quantity;}
    // getters and setters\
    public String getName(){return this.name;}
    public String getBrand(){return this.brand;}
    public double getPrice(){return this.price;}
    public int getQuantity(){return this.quantity;}
    public void setName(String name){this.name = name;}
    public void setBrand(String brand){this.brand = brand;}
    public void setPrice(double price){this.price = price;}
    public void setQuantity(int quantity){this.quantity = quantity;}

}


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// ALL THE METHODS IN THIS FILE USE POLYMORPHISM

// Interface Template
public class Inventory implements InventoryInterface{

    // Initialized as ArrayList
    private static ArrayList<StoreItem> storeInventory = new ArrayList<>();
    private static ArrayList<StoreItem> cartInventory = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    // Creation of Food Items
    ShelfStable spam = new ShelfStable("Canned Pork", "SPAM", 2.98, 20, "10/24/2027", false, "12/20/2030");
    Fruit apple = new Fruit("Granny Smith Apple", "Good & Gather", 1.01, 50, "11/05/2025", true, "Green");
    Outerwear coat = new Outerwear("Parka", "Calvin Klein", 100.56, 4, "M", "Black", "Nylon", "Long");


    // method templates to use for interface

    public void displayInventory(){
        System.out.printf("Displaying Inventory%n");
        for (StoreItem item : storeInventory){

            System.out.printf("Item: %s%n", item);
        }
    return;
    }
    public void sell(StoreItem item, int quantity){}
    public void add (StoreItem item,int quantity){
        storeInventory.add(item);
    }

}

import java.util.ArrayList;
import java.util.Scanner;

// ALL THE METHODS IN THIS FILE USE POLYMORPHISM

// Interface Template
public class Inventory implements InventoryInterface{

    // Initialized as ArrayList
    private static ArrayList<StoreItem> storeInventory = new ArrayList<>();
    private static ArrayList<StoreItem> cartInventory = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    // Construct inventory
    public Inventory() {
        storeInventory.add(new Fruit("wet", "puff", 69.994, 69, "09/05/2026", true,"red"));   // wipes
        storeInventory.add(new Vegetable("brockoli", "sun", 5.994, 5, "11/05/2025", false,"smooth","green")); // apple
        storeInventory.add(new TV("Samyung", "fuzzy", 99.99, 6, 6, 56,"1080p",false)); // orange
        storeInventory.add(new HouseholdItem("spray", "timmy", 5.5, 2, "Wool"));
    }

    // Display inventory
    @Override
    public void displayInventory(){
        System.out.printf("Displaying Inventory%n");
        for (StoreItem item : storeInventory){

            System.out.printf("Item: %s%n", item);
        }
    }

    //add to quantity
    @Override
    public void add() {
        displayInventory();

        System.out.println("Enter the item: ");
        String itemToIncrease = scanner.nextLine();
        System.out.println("Enter the Quantity to add: ");
        int quantity = scanner.nextInt();
        // Check if the item already exists
        for (StoreItem i : storeInventory) {
            if (i.getName().equalsIgnoreCase(itemToIncrease)) {
                i.setQuantity(i.getQuantity() + quantity);
                return;
            }
            break;
        }
        // If not found
        System.out.println("Invalid, add a new item");
    }

    //add new item
    @Override
    public void addNew() {

        // set condition to end when user is done adding
        boolean done = false;
        // get type
        while (!done) {
            System.out.println("\nSelect category to add:");
            System.out.println("1. Food");
            System.out.println("2. Electronics");
            System.out.println("3. Clothing");
            System.out.println("4. Household");
            System.out.print("Enter choice: ");

            int type = scanner.nextInt();

            switch (type) {
                // food
                case 1:{
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter brand: ");
                    String brand = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter expiration date(month/day/year): ");
                    String expiration = scanner.nextLine();
                    System.out.print("Enter organic value (true/false): ");
                    boolean organic = Boolean.parseBoolean(scanner.nextLine());

                    FoodItem newItem = new FoodItem(name,brand,price,quantity,expiration,organic);
                    storeInventory.add(newItem);

                    break;
                }
                // Electronic
                case 2:{
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter brand: ");
                    String brand = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Warranty length by of months (ex:6): ");
                    int months = scanner.nextInt();

                    ElectronicItem newItem = new ElectronicItem(name,brand,price,quantity,months);
                    storeInventory.add(newItem);

                    break;
                }
                //Clothing
                case 3:{
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter brand: ");
                    String brand = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Size: ");
                    String size = scanner.nextLine();
                    System.out.print("Enter color: ");
                    String color = scanner.nextLine();
                    System.out.print("Enter material: ");
                    String material = scanner.nextLine();

                    ClothingItem newItem = new ClothingItem(name,brand,price, quantity, size, color, material);
                    storeInventory.add(newItem);

                    break;
                }
                // Household
                case 4: {
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter brand: ");
                    String brand = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Material: ");
                    String material = scanner.nextLine();

                    HouseholdItem newItem = new HouseholdItem(name,brand,price,quantity,material);
                    storeInventory.add(newItem);
                    break;
                }

                // Invalid
                default: System.out.println("Invalid selection.");
                break;
            }

            // check condition
            System.out.print("Would you like to add another item? (Y/N): ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("n")){
                displayInventory();
                done = true;

            }
        }
    }
    @Override
    public void sell(String item, int quantity) {
        // TODO: implement selling logic later
    }

}

import java.util.ArrayList;
import java.util.Scanner;


// Inventory Interface implementation
public class Inventory implements InventoryInterface{

    // Initialized as ArrayList
    private static ArrayList<StoreItem> storeInventory = new ArrayList<>();
    private static ArrayList<StoreItem> cartInventory = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    // Construct inventory
    public Inventory() {
        storeInventory.add(new Fruit("wet", "puff", 69.994, 69, "09/05/2026", true,"red"));   // fruit
        storeInventory.add(new Vegetable("brockoli", "sun", 5.994, 5, "11/05/2025", false,"smooth","green")); // veg
        storeInventory.add(new TV("Samyung", "fuzzy", 99.99, 6, 6, 56,"1080p",false)); // tv
        storeInventory.add(new HouseholdItem("spray", "timmy", 5.5, 2, "Wool")); // Household
    }

    // Display inventory
    public void displayInventory(){
        System.out.printf("Displaying Inventory%n");
        for (StoreItem item : storeInventory){

            System.out.printf("Item: %s%n", item);
        }
    }

    //add to quantity
    public void add() {
        //set condition to loop for more adds
        boolean done = false;
        while (!done) {
            // get item and quantity
            System.out.print("Enter the item name: ");
            String itemToIncrease = scanner.nextLine();

            System.out.print("Enter the quantity to add: ");
            int quantity = scanner.nextInt();
            // clear buffer
            scanner.nextLine();

            // check item to add is in list
            boolean found = false;
            for (StoreItem i : storeInventory) {
                if (i.getName().equalsIgnoreCase(itemToIncrease)) {
                    i.setQuantity(i.getQuantity() + quantity);
                    found = true; //found
                    System.out.println("Quantity updated for " + i.getName() + ".");
                    displayInventory();
                    break;
                }
            }

            if (!found) {
                System.out.println(" Item not found in inventory.");
                System.out.print("Would you like to add it as a new item? (Y/N): ");
                String choice = scanner.nextLine();
                if (choice.equalsIgnoreCase("y")) {
                    addNew(); // not found we can add it as new
                } else {
                    System.out.println("Skipping new item addition.");
                }
            }
            // option to add more
            System.out.print("Would you like to update another item? (Y/N): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("n")) {
                done = true; // exit
                System.out.println("\nExiting program");
            } else if (!input.equalsIgnoreCase("y")) {
                System.out.println("Invalid input. Exiting program");
                done = true;
            }
        }
    }
    //add new item
    public void addNew() {
        boolean done = false;

        while (!done) {
            System.out.println("\nSelect category to add:");
            System.out.println("1. Food");
            System.out.println("2. Electronics");
            System.out.println("3. Clothing");
            System.out.println("4. Household");
            System.out.print("Enter choice: ");

            int type = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            switch (type) {
                case 1: { // Food
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter brand: ");
                    String brand = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter expiration date (month/day/year): ");
                    String expiration = scanner.nextLine();
                    System.out.print("Enter organic value (true/false): ");
                    boolean organic = Boolean.parseBoolean(scanner.nextLine());

                    FoodItem newItem = new FoodItem(name, brand, price, quantity, expiration, organic);
                    storeInventory.add(newItem);
                    System.out.println("Added FoodItem: " + name);
                    break;
                }

                case 2: { // Electronic
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter brand: ");
                    String brand = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    System.out.print("Enter warranty length (months): ");
                    int months = scanner.nextInt();
                    scanner.nextLine();

                    ElectronicItem newItem = new ElectronicItem(name, brand, price, quantity, months);
                    storeInventory.add(newItem);
                    System.out.println("Added ElectronicItem: " + name);
                    break;
                }

                case 3: { // Clothing
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter brand: ");
                    String brand = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter size: ");
                    String size = scanner.nextLine();
                    System.out.print("Enter color: ");
                    String color = scanner.nextLine();
                    System.out.print("Enter material: ");
                    String material = scanner.nextLine();

                    ClothingItem newItem = new ClothingItem(name, brand, price, quantity, size, color, material);
                    storeInventory.add(newItem);
                    System.out.println(" Added ClothingItem: " + name);
                    break;
                }

                case 4: { // Household
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter brand: ");
                    String brand = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter material: ");
                    String material = scanner.nextLine();

                    HouseholdItem newItem = new HouseholdItem(name, brand, price, quantity, material);
                    storeInventory.add(newItem);
                    System.out.println("Added HouseholdItem: " + name);
                    break;
                }

                default:
                    System.out.println("Invalid selection.");
                    break;
            }

            System.out.print("Would you like to add another item? (Y/N): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("n")) {
                done = true;
                displayInventory(); //display final inventory
                System.out.println("Closing program");
            } else if (!input.equalsIgnoreCase("y")) {
                System.out.println("Invalid selection, exiting program");
                done = true;
            }

        }
    }

    public void sell(String item, int quantity) {
        // TODO: implement selling logic later
    }

}

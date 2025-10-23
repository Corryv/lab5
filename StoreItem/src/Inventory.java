import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.Scanner;

public class Inventory implements InventoryInterface {

    private static ArrayList<StoreItem> storeInventory = new ArrayList<>();
    private static ArrayList<StoreItem> cartInventory = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    private static final double FOOD_TAX = 0.02;
    private static final double NONFOOD_TAX = 0.07;

    public Inventory() {
        storeInventory.add(new Fruit("Pich", "Tiko's", 1.25, 30, "11/05/2025", true, "Red"));
        storeInventory.add(new ShelfStable("Beens", "Miko's", 1.02, 44, "11/15/2030", false, "2 years"));
        storeInventory.add(new Vegetable("Brockali", "Fiko's", 20.20, 99, "11/09/2025", true, "tuff","pink"));
        storeInventory.add(new CleaningSupply("Spray", "Woolite", 5.50, 2, "Wool",false));
        storeInventory.add(new Furniture("Couch", "LayBachs", 5.54, 5, "silk","Love Seat"));
        storeInventory.add(new Shoe("VanFlight 3.0", "VanFlight", 0.50, 44, "5 kids","orange","leather","low"));
        storeInventory.add(new Shirt("Tank", "Davis", 25.50, 2, "Med","Red","Coton","Slim"));
        storeInventory.add(new Outerwear("SpekPants", "Woolite", 5.5, 2, "Med","White","Cotton","Marine"));
        storeInventory.add(new Phone("Fold", "SmartVision", 599.99, 5, 24, "Alpaca", 4));
        storeInventory.add(new Laptop("HDEEZ", "Camel", 899.99, 5, 24, "I9", 16));
        storeInventory.add(new TV("Samsung", "SmartVision", 199.99, 5, 24, 55, "4K", true));
        storeInventory.add(new Shirt("Planes", "Hanes", 14.99, 10, "L", "Black", "Cotton", "loose"));
        storeInventory.add(new CleaningSupply("Detergent", "StinkyDu's", 5.50, 2, "Plastic",true));
    }

    // === Display inventory in simple table format ===
    public void displayInventory() {
        System.out.println("\n=== Full Inventory ===");
        System.out.println("---------------------------------------------------------------");
        System.out.printf("%-15s %-15s %-10s %-8s %-8s%n",
                "Product", "Brand", "Price", "Quantity", "Category");
        System.out.println("---------------------------------------------------------------");

        for (StoreItem item : storeInventory) {
            String category;

            if (item instanceof FoodItem) category = "Food";
            else if (item instanceof ElectronicItem) category = "Electronics";
            else if (item instanceof ClothingItem) category = "Clothing";
            else if (item instanceof HouseholdItem) category = "Household";
            else category = "Other";

            System.out.printf("%-15s %-15s $%-9.2f %-8d %-10s%n",
                    item.getName(), item.getBrand(), item.getPrice(),
                    item.getQuantity(), category);
        }

        System.out.println("---------------------------------------------------------------");
    }


    public void displayCategoryInventory(int categoryChoice) {
        switch (categoryChoice) {
            case 1: {
                System.out.println("--- Food Items ---");
                for (StoreItem item : storeInventory)
                    if (item instanceof FoodItem) System.out.println(item);
                break;
            }
            case 2: {
                System.out.println("--- Electronics ---");
                for (StoreItem item : storeInventory)
                    if (item instanceof ElectronicItem) System.out.println(item);
                break;
            }
            case 3: {
                System.out.println("--- Clothing ---");
                for (StoreItem item : storeInventory)
                    if (item instanceof ClothingItem) System.out.println(item);
                break;
            }
            case 4: {
                System.out.println("--- Household ---");
                for (StoreItem item : storeInventory) {
                    if (item instanceof HouseholdItem) System.out.println(item);
                }
                break;
            }
            default: System.out.println("Invalid category choice.");
        }
    }


    public void addItem(int category) {
        boolean done = false;
        while (!done) {
            System.out.print("\nWould you like to add to an existing item? (Y/N): ");
            String addExisting = scanner.nextLine();
            // get item to increase
            if (addExisting.equalsIgnoreCase("y")) {
                System.out.print("Enter item name to increase: ");
                String name = scanner.nextLine();
                System.out.print("Enter quantity to add: ");
                int qty = scanner.nextInt();
                scanner.nextLine(); // clear buffer
                boolean found = false;

                // print updated quantity
                for (StoreItem item : storeInventory) {
                    if (item.getName().equalsIgnoreCase(name)) {
                        item.setQuantity(item.getQuantity() + qty);
                        found = true;
                        System.out.printf("Quantity updated for %s = %d\n", item.getName(), item.getQuantity());
                        break;
                    }
                }//Not Found
                if (!found) {System.out.println("Item not found in this category.");}
                System.out.print("Would you like to try again to add more items? (Y/N): ");
                String cont = scanner.nextLine();
                if (cont.equalsIgnoreCase("n"))
                    done = true;
            } else if (addExisting.equalsIgnoreCase("n")) {
                // user prompts addNew()
                addNew(category);
                // check if user wants to add more
                System.out.print("Would you like to add more items? (Y/N): ");
                String cont = scanner.nextLine();
                if (cont.equalsIgnoreCase("n")) {
                    done = true;
                }

            } else {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        } // end while

        System.out.println("\nUpdated inventory:");
        displayInventory();
    }
    // === Add new item based on category ===
    public void addNew(int category) {
        switch (category) {
            case 1: { // Food
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                System.out.print("Enter brand: ");
                String brand = scanner.nextLine();
                System.out.print("Enter price: ");
                double price = scanner.nextDouble();
                System.out.print("Enter quantity: ");
                int qty = scanner.nextInt();
                scanner.nextLine(); // clear buffer
                System.out.print("Enter expiration (mm/dd/yyyy): ");
                String exp = scanner.nextLine();
                System.out.print("Organic? (true/false): ");
                boolean organic = Boolean.parseBoolean(scanner.nextLine());
                storeInventory.add(new FoodItem(name, brand, price, qty, exp, organic));
                System.out.println(" Added new food item: " + name);
            }
            case 2: { // Electronics
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                System.out.print("Enter brand: ");
                String brand = scanner.nextLine();
                System.out.print("Enter price: ");
                double price = scanner.nextDouble();
                System.out.print("Enter quantity: ");
                int qty = scanner.nextInt();
                System.out.print("Enter warranty months: ");
                int months = scanner.nextInt();
                scanner.nextLine(); // clear buffer
                storeInventory.add(new ElectronicItem(name, brand, price, qty, months));
                System.out.println(" Added new electronic item: " + name);
            }
            case 3: { // Clothing
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                System.out.print("Enter brand: ");
                String brand = scanner.nextLine();
                System.out.print("Enter price: ");
                double price = scanner.nextDouble();
                System.out.print("Enter quantity: ");
                int qty = scanner.nextInt();
                scanner.nextLine(); // clear buffer
                System.out.print("Enter size: ");
                String size = scanner.nextLine();
                System.out.print("Enter color: ");
                String color = scanner.nextLine();
                System.out.print("Enter material: ");
                String material = scanner.nextLine();
                storeInventory.add(new ClothingItem(name, brand, price, qty, size, color, material));
                System.out.println(" Added new clothing item: " + name);
            }
            case 4:{ // Household
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                System.out.print("Enter brand: ");
                String brand = scanner.nextLine();
                System.out.print("Enter price: ");
                double price = scanner.nextDouble();
                System.out.print("Enter quantity: ");
                int qty = scanner.nextInt();
                scanner.nextLine(); // clear buffer
                System.out.print("Enter material: ");
                String material = scanner.nextLine();
                storeInventory.add(new HouseholdItem(name, brand, price, qty, material));
                System.out.println("Added new household item: " + name);
            }
            default: System.out.println("Invalid category.");
        }
    }

    // SellItems
    public void sellItems() {
        boolean done = false;
        double subtotal = 0.0;
        cartInventory.clear();

        while (!done) {
            System.out.println("\nSelect a category to shop:");
            System.out.println("1. Food");
            System.out.println("2. Electronics");
            System.out.println("3. Clothing");
            System.out.println("4. Household");
            System.out.print("Enter choice: ");
            int category = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            displayCategoryInventory(category);

            System.out.print("Enter item name to buy: ");
            String name = scanner.nextLine();
            System.out.print("Enter quantity: ");
            int qty = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            for (StoreItem item : storeInventory) {
                if (item.getName().equalsIgnoreCase(name) && item.getQuantity() >= qty) {
                    item.setQuantity(item.getQuantity() - qty);
                    cartInventory.add(item);
                    subtotal += item.getPrice() * qty;
                    System.out.println("Added " + qty + " x " + item.getName());
                    break;
                }
            }
            System.out.print("Would you like to buy another item? (Y/N): ");
            String cont = scanner.nextLine().trim();
            if (cont.equalsIgnoreCase("n")) done = true;
        }

        checkout(subtotal);
        System.out.println("\nUpdated inventory after sale:");
        displayInventory();
    }

    // Checkout method
    private void checkout(double subtotal) {
        double foodTax = 0.05;
        double nonFoodTax = 0.07;

        // calc food and non food tax
        for (StoreItem item : cartInventory) {
            if (item instanceof FoodItem)
                foodTax += item.getPrice() * FOOD_TAX;
            else
                nonFoodTax += item.getPrice() * NONFOOD_TAX;
        }
        //total
        double total = subtotal + foodTax + nonFoodTax;

        System.out.println("\n--- ORDER SUMMARY ---");
        for (StoreItem i : cartInventory)
            System.out.println(i);

        System.out.printf("Subtotal: $%.2f%n", subtotal);
        System.out.printf("Food Tax: $%.2f%n", foodTax);
        System.out.printf("Non-Food Tax: $%.2f%n", nonFoodTax);
        System.out.printf("TOTAL: $%.2f%n", total);

        System.out.println("\nReturn Policy:");
        System.out.println("Food: No returns.");
        System.out.println("Electronics/Clothing/Household: 30 days with receipt.");
    }
}
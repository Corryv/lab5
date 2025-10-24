import java.util.ArrayList;
import java.util.Scanner;

/**
 * Inventory is used to construct initial inventory and manage the inventory by adding and selling items.
 * User inputs that are either int or double go through the appropriate validation helper method
 * Polymorphism: Each method in the Inventory polymorphism in different ways, but mainly through interacting
 *               with the Inventory. More detail will be in the javadocs for the methods.
 *               The cartInventory and storeInventory both use polymorphism by initializing
 *               an ArrayList of abstract StoreItem objects which can hold any child of the StoreItemClass.
 * Class Variables: storeInventory - inventory initialized as ArrayList
 *                  cartInventory - cart inventory for the sell method initialized as an ArrayList
 *                  FOOD_TAX - constant tax for all food items
 *                  NONFOOD_TAX = constant tax for all non-food items
 * Methods:
 *          Inventory() - constructor used to initialize base inventory
 *          displayInventory() - prints table display of inventory
 *          displayCategoryInventory(int category) - returns printed table of specific category
 *          addItem(int category) - adds items to inventory
 *          addNewItem(int) - add item that is not currently in to inventory
 *          sellItems() - Prompts the user for a category to display, offers to sell items
 *          checkout(double) - calculates the user checkout from subtotal and taxes.
 *          getValidatedInt(String) - returns validated int from a user input according to the prompt parameter
 *          getValidatedDouble(String) - returns validated double from a user input according to the prompt parameter
 */
public class Inventory implements InventoryInterface {

    private static ArrayList<StoreItem> storeInventory = new ArrayList<>();
    private static ArrayList<StoreItem> cartInventory = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    private static final double FOOD_TAX = 0.02;
    private static final double NONFOOD_TAX = 0.07;
    /**
     * Constructs inventory to be initialized with a base inventory. (contains more than one of each item type)
     * Polymorphism: The inventory is initialized with children of the abstract StoreItem
     */
    public Inventory() {
        storeInventory.add(new Fruit("Pich", "Tiko's", 1.25, 30, "11/05/2025", true, "Red"));
        storeInventory.add(new ShelfStable("Beens", "Miko's", 1.02, 44, "11/15/2030", false, "2 years"));
        storeInventory.add(new Vegetable("Brockali", "Fiko's", 20.20, 99, "11/09/2025", true, "tuff", "pink"));
        storeInventory.add(new CleaningSupply("Spray", "Woolite", 5.50, 2, "Wool", false));
        storeInventory.add(new Furniture("Couch", "LayBachs", 5.54, 5, "silk", "Love Seat"));
        storeInventory.add(new Shoe("VanFlight 3.0", "VanFlight", 0.50, 44, "5 kids", "orange", "leather", "low"));
        storeInventory.add(new Shirt("Tank", "Davis", 25.50, 2, "Med", "Red", "Coton", "Slim"));
        storeInventory.add(new Outerwear("SpekPants", "Woolite", 5.5, 2, "Med", "White", "Cotton", "Marine"));
        storeInventory.add(new Phone("Fold", "SmartVision", 599.99, 5, 24, "Alpaca", 4));
        storeInventory.add(new Laptop("HDEEZ", "Camel", 899.99, 5, 24, "I9", 16));
        storeInventory.add(new TV("Samsung", "SmartVision", 199.99, 5, 24, 55, "4K", true));
        storeInventory.add(new Shirt("Planes", "Hanes", 14.99, 10, "L", "Black", "Cotton", "loose"));
        storeInventory.add(new CleaningSupply("Detergent", "StinkyDu's", 5.50, 2, "Plastic", true));
    }

    /**
     * displayInventory displays each item in a table format
     * Polymorphism: The items are categorized by checking if each item is an instance of either
     *               Electronic, Household, Food, or Clothing.
     */
    public void displayInventory() {
        System.out.println("\n=== Full Inventory ===");
        System.out.println("---------------------------------------------------------------");
        System.out.printf("%-15s %-15s %-10s %-8s %-8s%n",
                "Product", "Brand", "Price", "Quantity", "Category");
        System.out.println("---------------------------------------------------------------");
        // Polymorphism demonstrated below
        for (StoreItem item : storeInventory) {
            String category; // holds category for each item to display.
            if (item instanceof FoodItem) {category = "Food";}
            else if (item instanceof ElectronicItem) {category = "Electronics";}
            else if (item instanceof ClothingItem) {category = "Clothing";}
            else{category = "Household";} // there is no option in program to enter any other categories

            System.out.printf("%-15s %-15s $%-9.2f %-8d %-10s%n",
                    item.getName(), item.getBrand(), item.getPrice(),
                    item.getQuantity(), category);
        }

        System.out.println("---------------------------------------------------------------");
    }

    /**
     * displayCategoryInventory displays the inventory of a specific category selected
     * Polymorphism: This method uses "instanceof" to identify the items that belong to each category
     * @param categoryChoice number to represent categories in switch cases.
     */
    public void displayCategoryInventory(int categoryChoice) {
        switch (categoryChoice) {
            case 1: {// FoodItems
                System.out.println("--- Food Items ---");
                for (StoreItem item : storeInventory)
                    if (item instanceof FoodItem) System.out.println(item);
                break;
            }
            case 2: {// Electronics
                System.out.println("--- Electronics ---");
                for (StoreItem item : storeInventory)
                    if (item instanceof ElectronicItem) System.out.println(item);
                break;
            }
            case 3: {// Clothing
                System.out.println("--- Clothing ---");
                for (StoreItem item : storeInventory)
                    if (item instanceof ClothingItem) System.out.println(item);
                break;
            }
            case 4: {// Household
                System.out.println("--- Household ---");
                for (StoreItem item : storeInventory) {
                    if (item instanceof HouseholdItem) System.out.println(item);
                }
                break;
            }
            // Invalid Selection for Category number
            default: System.out.println("Invalid category choice.");
        }
    }

    /**
     * addItem prompts if to add existing item or not. If add is selected the user will be prompted for name of item
     * followed by the quantity. If addNew is selected the user is prompted to construct their own item that is a type
     * of the category selected.
     * Polymorphism: The addItem method uses a for loop to iterate inventory StoreItems to validate selected item name
     * and the quantity.
     * @param category number to represent the category to add to
     */
    public void addItem(int category) {
        boolean done = false;
        while (!done) {
            System.out.print("\nWould you like to add to an existing item? (Y/N): ");
            String addExisting = scanner.nextLine();
            // get item to increase
            if (addExisting.equalsIgnoreCase("y")) {
                System.out.print("Enter item name to increase: ");
                String name = scanner.nextLine();
                int qty = getValidatedInt("Enter quantity to add: ");

                boolean found = false;
                // Polymorphism: print updated quantity
                for (StoreItem item : storeInventory) {
                    if (item.getName().equalsIgnoreCase(name)) {
                        item.setQuantity(item.getQuantity() + qty);
                        found = true;
                        System.out.printf("Quantity updated for %s = %d\n", item.getName(), item.getQuantity());
                        break;
                    }
                }//Not Found
                if (!found) {
                    System.out.println("Item not found in this category.");
                    System.out.print("Would you like to try again? (Y/N): ");
                }
                // if found we already added to item quantity. Option to exit or continue adding
                if (found) {System.out.println("Would you like to add another item? (Y/N): ");}

                String cont = scanner.nextLine();
                if (cont.equalsIgnoreCase("n")){done = true;}
            } // end of if add

                // user want to addNew
            else if (addExisting.equalsIgnoreCase("n")) {
                // user prompts addNew()
                addNew(category);
                // check if user wants to add more
                System.out.print("Would you like to add more items? (Y/N): ");
                String cont = scanner.nextLine();
                if (cont.equalsIgnoreCase("n")) {
                    done = true;
                } else if (cont.equalsIgnoreCase("y")) {
                    continue;
                } else {
                    System.out.println("Invalid input. Please enter Y or N.");
                }// return to prompt again
            }
        } // end while

        // Done adding
        System.out.println("\nUpdated inventory:");
        displayInventory();
    }

    /**
     * addNew takes the category the user would like to build, then prompts the user for inputs to construct and add a
     * selected item type/category to inventory.
     * the inventory.
     * Polymorphism: Demonstrated by all items in the list being stored as StoreItems we can add each type to the list.
     * @param category the category number under which to add the new item
     */
    public void addNew(int category) {
        switch (category) {
            case 1: { // Food
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                System.out.print("Enter brand: ");
                String brand = scanner.nextLine();
                double price = getValidatedDouble("Enter Price: ");
                int qty = getValidatedInt("Enter quantity: ");
                System.out.print("Enter expiration (mm/dd/yyyy): ");
                String exp = scanner.nextLine();
                System.out.print("Organic? (true/false): ");
                boolean organic = Boolean.parseBoolean(scanner.nextLine());
                storeInventory.add(new FoodItem(name, brand, price, qty, exp, organic));
                System.out.println(" Added new food item: " + name);
                break;
            }
            case 2: { // Electronics
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                System.out.print("Enter brand: ");
                String brand = scanner.nextLine();
                double price = getValidatedDouble("Enter Price: ");
                int qty = getValidatedInt("Enter quantity: ");
                int months = getValidatedInt("Enter warranty length in months: ");
                storeInventory.add(new ElectronicItem(name, brand, price, qty, months));
                System.out.println(" Added new electronic item: " + name);
                break;
            }
            case 3: { // Clothing
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                System.out.print("Enter brand: ");
                String brand = scanner.nextLine();
                double price = getValidatedDouble("Enter Price: ");
                int qty = getValidatedInt("Enter quantity: ");
                System.out.print("Enter size: ");
                String size = scanner.nextLine();
                System.out.print("Enter color: ");
                String color = scanner.nextLine();
                System.out.print("Enter material: ");
                String material = scanner.nextLine();
                storeInventory.add(new ClothingItem(name, brand, price, qty, size, color, material));
                System.out.println(" Added new clothing item: " + name);
                break;
            }
            case 4: { // Household
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                System.out.print("Enter brand: ");
                String brand = scanner.nextLine();
                double price = getValidatedDouble("Enter Price: ");
                int qty = getValidatedInt("Enter quantity: ");
                System.out.print("Enter material: ");
                String material = scanner.nextLine();
                storeInventory.add(new HouseholdItem(name, brand, price, qty, material));
                System.out.println("Added new household item: " + name);
                break;
            }
            default:
                System.out.println("Invalid category.");
        }
    }

    /**
     * sellItems prompts the user for the category first, then displays the inventory for the category. The user is
     * next prompted to enter a name and quantity. The user is next printed the bought items, followed by asking user
     * to check out. Once checkout the program prints receipt and updated inventory is complete the user exits
     * sellItems.
     */
    public void sellItems() {
        boolean done = false;
        // subtotal for cart starts at 0
        double subtotal = 0.0;
        cartInventory.clear();
        // Will break out when user exits or is done shopping
        while (!done) { // get user input for cat
            System.out.println("\nSelect a category to shop:");
            System.out.println("1. Food");
            System.out.println("2. Electronics");
            System.out.println("3. Clothing");
            System.out.println("4. Household");
            System.out.println("0. Return to Main Menu");
            int category = getValidatedInt("Enter Category: ");
            // Exit
            if (category == 0) {
                return;
            }
            // invalid back to menu (helper functions cover string inputs)
            if (category != 1 && category != 2 && category != 3 && category != 4) {
                System.out.println("Invalid category choice. Select Category again");
                continue; // go back to select category
            }
            displayCategoryInventory(category);
            // get item and quantity to buy
            System.out.print("Enter item name to buy: ");
            String name = scanner.nextLine();
            int qty = getValidatedInt("Enter quantity: ");
            StoreItem foundItem = null;
            // check item and quantity values. Then Calc subtotal
            for (StoreItem item : storeInventory) {
                if (item.getName().equalsIgnoreCase(name) && item.getQuantity() >= qty) {
                    foundItem = item;
                    break;
                }
            }
            // not found or invalid quantity
            if (foundItem == null) {
                System.out.println("Invalid input. Try again.");
                continue; // restart loop
            }
            // if we made it this fair the values for quantity and name are valid
            // process purchase
            foundItem.setQuantity(foundItem.getQuantity() - qty);
            cartInventory.add(foundItem);
            subtotal += foundItem.getPrice() * qty;
            System.out.println("Added " + qty + " x " + foundItem.getName() + " to cart.");
            // option to continue shopping
            System.out.print("Would you like to buy another item? (Y/N): ");
            String cont = scanner.nextLine();
            if (cont.equalsIgnoreCase("n")) done = true;
        }// end of while
        // Confirm and checkout
        System.out.print("Proceed to checkout? (Y/N): ");
        System.out.print("Anything other than y will cancel the order!\n");
        String confirm = scanner.nextLine();
        if (!confirm.equalsIgnoreCase("y")) {// anything NOT "y"
            System.out.println("Checkout cancelled. Returning to main menu");
            return;
        }
        checkout(subtotal);
        System.out.println("\nUpdated inventory after sale:");
        displayInventory();
    }// end of sell

    // Checkout method
    private void checkout(double subtotal) {
        // initialized as 0 to accumulate tax values for each
        double foodTax = 0.00;
        double nonFoodTax = 0.00;

        // calc food and non food tax
        for (StoreItem item : cartInventory) {
            if (item instanceof FoodItem) {
                foodTax += item.getPrice() * item.getQuantity() * FOOD_TAX;
            } else {
                nonFoodTax += item.getPrice() * item.getQuantity() * NONFOOD_TAX;
            }
        } // end of for loop
        //total
        double total = subtotal + foodTax + nonFoodTax;
        // print items in cart for summary
        System.out.println("\n--- ORDER SUMMARY ---");
        for (StoreItem i : cartInventory) {System.out.println(i);}
        // display purchase summary
        System.out.println("\n----- Totals -----");
        System.out.printf("Subtotal: $%.2f%n", subtotal);
        System.out.printf("Food Tax: $%.2f%n", foodTax);
        System.out.printf("Non-Food Tax: %.2f%n ", nonFoodTax);
        System.out.printf("TOTAL: $%.2f%n", total);
        // Return Policy
        System.out.println("\nReturn Policy:");
        System.out.println("Food: No returns.");
        System.out.println("Electronics/Clothing/Household: 30 days with receipt.");
    }
    /**
     * getValidatedInt prints the prompt to the user and ensures the user enters a valid int.
     * @param prompt String prompt that the user is responding to
     * @return int value that has been validated from negatives and strings
     */
    static int getValidatedInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();
            try {
                int value = Integer.parseInt(input);
                if (value < 0) {
                    System.out.println("Value must be positive. Try again.");
                    continue;
                }
                return value;
            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter a whole number");
            }
        }
    }

    /**
     * getValidatedDouble prints the prompt to the user and ensures the user enters a valid double.
     * @param prompt String prompt that the user is responding to
     * @return int value that has been validated from negatives and strings
     */
    public static double getValidatedDouble(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();
            try {
                double value = Double.parseDouble(input);
                if (value < 0) {
                    System.out.println("Value cannot be negative. Try again.");
                    continue;
                }
                return value; // valid double
            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter a valid number.");
            }
        }
    }
}

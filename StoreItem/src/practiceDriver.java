/**
 * @author Corry Vantienen, Shane Gilchrest
 * @Section CSC 331 001-003
 * @Date 10/20/2025
 * Lab 5: Wilmington Quick Shop
 * Purpose: This Driver file simulates adding and selling items to a shop inventory. The purpose is to demonstrate
 *          the use of polymorphism, Inheritance, and Interfaces.
 *
 */
import java.util.Scanner;

/**
 *
 * Purpose: The driver file runs the Wilmington Quick Shop program. The main menu is controlled by switch cases.Each case
 * directs the user based on the case (1-4). "sell an Item" directs the user to the sell method, "Add an Item"prompts
 * the user for category before going into the addItem method, and "exit" closes the program
 *
 * Polymorpho
 * getValidatedInt() is used handles int inputs (signature in Inventory class)
 */

public class practiceDriver {

    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Main controls the flow of the user interface with switch cases.
     * Methods :
     *          sellItems() - Prompts the user for a category to display, offers to sell items
     *          addItem(int category) - adds items to inventory
     *          getValidatedInt(String) - returns validated int from a user input according to the prompt parameter
     */
    public static void main(String[] args) {

        // Initialize pre-stocked Inventory
        Inventory inventory = new Inventory();
        boolean exit = false;
        // Get user input for directions on how to proceed
        while (!exit) {
            System.out.println("\n----- Wilmington Quick Shop -----");
            System.out.println("1. Sell an item");
            System.out.println("2. Add an item to inventory");
            System.out.println("3. Display inventory");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = Inventory.getValidatedInt("Enter Choice #: ");
            // 4 Cases: Sell , Add, Display Inventory, and Exiting.
            switch (choice) {
                case 1:
                    inventory.sellItems();
                    break;

                case 2: {
                    // Prompt what type of item to add
                    System.out.println("\nSelect item category to add:");
                    System.out.println("1. Food");
                    System.out.println("2. Electronics");
                    System.out.println("3. Clothing");
                    System.out.println("4. Household");
                    System.out.println("0. Return to menu");
                    int categoryChoice = Inventory.getValidatedInt("Enter Category #: ");

                    // Exit
                    if (categoryChoice == 0) {
                        System.out.println("Exiting checkout...");
                        return; // leaves to menu
                    }

                    if (categoryChoice != 1 && categoryChoice != 2 && categoryChoice != 3 && categoryChoice != 4) {
                        System.out.println("Invalid category choice.");
                        continue; // go back to main menu
                    }
                    // Show items in that category
                    System.out.printf("Items in Category\n");
                    inventory.displayCategoryInventory(categoryChoice);

                    // Add Item (will give option to add new and existing items)
                    inventory.addItem(categoryChoice);
                    break;
                }

                case 3:
                    inventory.displayInventory();
                    break;

                case 4:
                    System.out.println("Exiting program");
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice!");
                    break;
            } // end switch
        } // end while
    } // end main
} // end class
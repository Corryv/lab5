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

public class practiceDriver {

    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Main:  controls flow of the menu-based interface.
     * Main-Menu: Offers the user 4 options
     *             buy, sell, display inventory, and exit
     *
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
            int choice = scanner.nextInt();
            scanner.nextLine(); // buffer

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
                    System.out.print("Enter choice by #: ");
                    int categoryChoice = scanner.nextInt();
                    scanner.nextLine();
                    // Return to Main Menu
                    if (categoryChoice == 0) {break;}
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
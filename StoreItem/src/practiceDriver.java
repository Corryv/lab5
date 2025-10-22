import java.util.Scanner;

public class practiceDriver {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("----- Welcome to Wilmington Quick Shop -----");
        System.out.println("      ================================");
        System.out.println("       Select from the options below");
        System.out.println("      ================================");
        System.out.println("1: Sell an item.");
        System.out.println("2: Add New item to inventory.");
        System.out.println("3: Add to an existing item in inventory.");
        System.out.println("4: Checkout cart.");
        System.out.print("Enter choice: ");
        //get user choice
        int choice = getUserChoice();
        // initialize the pre-constructed inventory
        Inventory inventory = new Inventory();

        // Handle user choice
        switch (choice) {
            case 1: {
                System.out.println("Sell feature coming soon!");
                break;
            }
            case 2: {inventory.addNew();break;}
            case 3: {inventory.add();break;}
            default: System.out.println("Invalid choice. Please restart the program.");
            break;
        }
        inventory.displayInventory();
    }// end of main

    private static int getUserChoice() {
        while (true) {
            try {
                String input = scanner.nextLine();
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number option.");
            }
        }
    }
}
import java.util.Scanner;

public class practiceDriver {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("----- Welcome to Wilmington Quick Shop -----");
        System.out.println("      ================================");
        System.out.println("       Select from the options below");
        System.out.println("      ================================");
        System.out.println("1: Sell an item.");
        System.out.println("2: Add an Item");
        System.out.println("3: Checkout cart.");
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
            case 2: {
                inventory.displayInventory();
                System.out.println("Add to an exisitng item?(Y/N)");
                String choice4add = scanner.nextLine();
                if (choice4add.equalsIgnoreCase("y")) {
                    inventory.add();
                } else if(choice4add.equalsIgnoreCase("n")) {
                    inventory.addNew();
                } else {
                    System.out.println("Invalid, exiting program");
                }
                break;
            }
            case 3: break;
            default:
                System.out.println("Invalid choice. Please restart the program.");
                break;
        }
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
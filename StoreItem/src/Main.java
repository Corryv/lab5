//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    // TEST CLASSES
    public static void main(String[] args) {

        System.out.println("----- Welcome to Wilmington Quick Shop -----");
        System.out.println("      ================================");
        System.out.println("       Select from the options below");
        System.out.println("      ================================");


        System.out.println("1: Sell an item.");
        System.out.println("2: Add item to inventory.");
        System.out.println("3: Checkout cart.");

        getUserChoice();



        // Initialize items
        FoodItem wipes = new FoodItem("wet", "puff", 69.994, 69, "09/05/2026", true);
        FoodItem apple = new FoodItem("granny", "sun", 5.994, 5, "11/05/2025",  false);
        FoodItem orange = new FoodItem("orange", "fuzzy", 9.994, 6, "11/30/2025", true);
        HouseholdItem spray = new HouseholdItem("spray","timmy",5.5,2,"Wool");
        // add to inventory
        Inventory inventory = new Inventory();
        inventory.add(wipes,1);
        inventory.add(apple,1);
        inventory.add(orange,3);
        inventory.add(spray,2);

        //display to inventory
        inventory.displayInventory();

    }

    private static int getUserChoice() {
        while (true){
            try{
                String input = scanner.nextLine();
                return Integer.parseInt(input);}
            catch (NumberFormatException e) {
                System.out.println("Please enter a valid number option.");
            }
        }

    }
}
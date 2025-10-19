//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    // TEST CLASSES
    public static void main(String[] args) {

        // Initialize items
        FoodItem wipes = new FoodItem("wet", "puff", 69.994, 69, "9/5", true);
        FoodItem apple = new FoodItem("granny", "sun", 5.994, 5, "11/5",  false);
        FoodItem orange = new FoodItem("orange", "fuzzy", 9.994, 6, "11/30", true);
        HousehouldItem spray = new HousehouldItem("spray","timmy",-5.5,2,"Wool");
        // add to inventory
        Inventory inventory = new Inventory();
        inventory.add(wipes,1);
        inventory.add(apple,1);
        inventory.add(orange,3);
        inventory.add(spray,2);

        //display to inventory
        inventory.displayInventory();




    }
}
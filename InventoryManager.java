import java.util.HashMap;
import java.util.Map;
public class InventoryManager {
    private Map<String, Integer> inventory;

    public InventoryManager() {
        inventory = new HashMap<>();
        inventory.put("laptop", 5);
        inventory.put("phone", 10);
        inventory.put("headphones", 20);
    }

    public boolean checkStock(String productName) {
        if (inventory.getOrDefault(productName, 0) > 0) {
            System.out.println(productName + " is in stock.");
            return true;
        } else {
            System.out.println(productName + " is out of stock.");
            return false;
        }
    }

    public void reduceStock(String productName) {
        if (inventory.getOrDefault(productName, 0) > 0) {
            inventory.put(productName, inventory.get(productName) - 1);
            System.out.println("Stock for " + productName + " reduced by 1.");
        } else {
            System.out.println("No stock left to reduce for " + productName + ".");
        }
    }
}

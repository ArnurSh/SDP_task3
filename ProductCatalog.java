import java.util.HashMap;
import java.util.Map;
public class ProductCatalog {
    private Map<String, Integer> products;

    public ProductCatalog() {
        products = new HashMap<>();
        products.put("laptop", 1000);
        products.put("phone", 500);
        products.put("headphones", 100);
    }

    public Integer searchProduct(String productName) {
        if (products.containsKey(productName)) {
            System.out.println("Product '" + productName + "' is available.");
            return products.get(productName);
        } else {
            System.out.println("Product '" + productName + "' not found.");
            return null;
        }
    }
}

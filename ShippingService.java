public class ShippingService {
    public int calculateShipping(String productName) {
        System.out.println("Shipping calculated for " + productName + ".");
        return 10;
    }

    public void shipProduct(String productName) {
        System.out.println("Product '" + productName + "' has been shipped.");
    }
}

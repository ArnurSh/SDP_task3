public class ShoppingFacade {
    private ProductCatalog productCatalog;
    private PaymentProcessor paymentProcessor;
    private InventoryManager inventoryManager;
    private ShippingService shippingService;

    public ShoppingFacade() {
        this.productCatalog = new ProductCatalog();
        this.paymentProcessor = new PaymentProcessor();
        this.inventoryManager = new InventoryManager();
        this.shippingService = new ShippingService();
    }

    public String placeOrder(String productName) {
        Integer productPrice = productCatalog.searchProduct(productName);
        if (productPrice == null) {
            return "Order failed: Product not found.";
        }

        if (!inventoryManager.checkStock(productName)) {
            return "Order failed: Product out of stock.";
        }

        int shippingCost = shippingService.calculateShipping(productName);
        int totalCost = productPrice + shippingCost;
        if (!paymentProcessor.processPayment(totalCost)) {
            return "Order failed: Payment was unsuccessful.";
        }

        inventoryManager.reduceStock(productName);
        shippingService.shipProduct(productName);

        return "Order placed successfully for '" + productName + "'. Total cost: $" + totalCost + ".";
    }
}

public class Client {
    public static void main(String[] args) {
        ShoppingFacade shoppingFacade = new ShoppingFacade();

        System.out.println("\n---- Ordering a laptop ----");
        String result = shoppingFacade.placeOrder("laptop");
        System.out.println(result);

        System.out.println("\n---- Ordering a phone ----");
        result = shoppingFacade.placeOrder("phone");
        System.out.println(result);

        System.out.println("\n---- Trying to order a product not in catalog ----");
        result = shoppingFacade.placeOrder("tablet");
        System.out.println(result);

        System.out.println("\n---- Trying to order a product out of stock ----");
        result = shoppingFacade.placeOrder("headphones");
        System.out.println(result);
    }
}

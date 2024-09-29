public class CafeManager {
    private static CafeManager instance;
    private int activeOrders;

    private CafeManager() {
        activeOrders = 0;
    }

    public static CafeManager getInstance() {
        if (instance == null) {
            instance = new CafeManager();
        }
        return instance;
    }

    public void placeOrder(OrderPrototype order) {
        activeOrders++;
        System.out.println("Order placed: " + order.getCoffeeName());
    }

    public int getActiveOrders() {
        return activeOrders;
    }
}
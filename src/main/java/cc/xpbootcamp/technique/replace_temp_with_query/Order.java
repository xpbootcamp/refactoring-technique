package cc.xpbootcamp.technique.replace_temp_with_query;

public class Order {
    private int quantity;
    private double itemPrice;

    public Order(double itemPrice, int quantity) {
        this.quantity = quantity;
        this.itemPrice = itemPrice;
    }

    double getPrice() {
        return basePrice() * discountFactor();
    }

    private double discountFactor() {
        return basePrice() > 100 ? 0.95 : 0.98;
    }

    private double basePrice() {
        return quantity * itemPrice;
    }
}

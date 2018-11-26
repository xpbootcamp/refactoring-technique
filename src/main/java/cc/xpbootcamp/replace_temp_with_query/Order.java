package cc.xpbootcamp.replace_temp_with_query;

public class Order {
    private int quantity;
    private double itemPrice;

    public Order(double itemPrice, int quantity) {
        this.quantity = quantity;
        this.itemPrice = itemPrice;
    }

    double getPrice() {
        double basePrice = quantity * itemPrice;
        double discountFactor;
        if (basePrice > 100) {
            discountFactor = 0.95;
        } else {
            discountFactor = 0.98;
        }
        return basePrice * discountFactor;
    }
}

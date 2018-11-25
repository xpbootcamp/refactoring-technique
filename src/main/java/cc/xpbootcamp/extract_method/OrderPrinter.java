package cc.xpbootcamp.extract_method;

import java.util.List;

public class OrderPrinter {
    private List<Order> orders;
    private String name;

    public OrderPrinter(String name, List<Order> orders) {
        this.name = name;
        this.orders = orders;
    }

    public void print() {
        printBanner();

        printDetail(getOutstanding());
    }

    private double getOutstanding() {
        double outstanding = 0.0;

        for (Order order : orders) {
            outstanding += order.getAmount();
        }
        return outstanding;
    }

    private void printDetail(double outstanding) {
        System.out.println("name: " + name);
        System.out.println("amount: " + outstanding);
    }

    private void printBanner() {
        System.out.println("****************************************");
        System.out.println("*************Customer Owes *************");
        System.out.println("****************************************");
    }

}

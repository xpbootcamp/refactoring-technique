package cc.xpbootcamp.extract_method;

import java.util.List;

public class OrderPrinter {
    private List<Order> orders;
    private String name;

    public void print() {
        // print banner
        System.out.println("****************************************");
        System.out.println("*************Customer Owes *************");
        System.out.println("****************************************");

        double outstanding = 0.0;

        for (Order order : orders) {
            outstanding += order.getAmount();
        }

        // print detail
        System.out.println("name: " + name);
        System.out.println("amount: " + outstanding);
    }

}

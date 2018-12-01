package cc.xpbootcamp.replace_data_value_with_object;

import java.util.List;

public class OrderService {
    public static int countCustomerOrders(String customer, List<Order> orders) {
        int result = 0;
        for (Order order : orders) {
            if (order.getCustomerName().equals(customer)) {
                result++;
            }
        }
        return result;
    }
}

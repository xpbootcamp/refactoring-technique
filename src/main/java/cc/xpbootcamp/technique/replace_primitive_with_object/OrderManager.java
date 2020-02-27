package cc.xpbootcamp.technique.replace_primitive_with_object;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OrderManager {
    private List<Order> remainingOrders;

    public OrderManager() {
        this.remainingOrders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        remainingOrders.add(order);
    }

    public long countHighPriorityOrder() {
        return remainingOrders.stream().filter(order -> order.getPriority().equals("rush") || order.getPriority().equals("high")).count();
    }

    public Optional<Order> allocateNextOrder() {
        Optional<Order> first = remainingOrders.stream().min((o1, o2) -> {
            if (o1.getPriority().equals(o2.getPriority())) {
                return o1.getCreatedDate().compareTo(o2.getCreatedDate());
            }
            List<String> priorities = Arrays.asList("rush", "high", "normal", "low");
            return priorities.indexOf(o1.getPriority()) - priorities.indexOf(o2.getPriority());
        });
        first.ifPresent(order -> remainingOrders.remove(order));
        return first;
    }

    public List<Order> getRemainingOrders() {
        return remainingOrders;
    }
}

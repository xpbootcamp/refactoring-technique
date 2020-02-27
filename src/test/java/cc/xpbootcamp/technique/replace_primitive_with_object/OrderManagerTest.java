package cc.xpbootcamp.technique.replace_primitive_with_object;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class OrderManagerTest {

    private OrderManager orderManager;

    @BeforeEach
    public void setUp() {
        orderManager = new OrderManager();
    }

    @Test
    public void should_add_order() {
        orderManager.addOrder(new Order("1", "high", LocalDate.now()));

        assertEquals(1, orderManager.getRemainingOrders().size());
    }

    @Test
    public void should_count_high_priority_orders_as_2_when_orders_are_rush_and_high() {
        orderManager.addOrder(new Order("1", "high", LocalDate.now().minusDays(2)));
        orderManager.addOrder(new Order("2", "rush", LocalDate.now().minusDays(1)));

        assertEquals(2L, orderManager.countHighPriorityOrder());
    }

    @Test
    public void should_count_high_priority_orders_as_2_when_orders_are_low_and_normal() {
        orderManager.addOrder(new Order("1", "low", LocalDate.now().minusDays(2)));
        orderManager.addOrder(new Order("2", "normal", LocalDate.now().minusDays(1)));

        assertEquals(0L, orderManager.countHighPriorityOrder());
    }

    @Test
    public void should_allocate_order() {
        orderManager.addOrder(new Order("1", "low", LocalDate.now().minusDays(1)));
        orderManager.addOrder(new Order("2", "low", LocalDate.now().minusDays(3)));

        orderManager.allocateNextOrder();

        assertEquals(1, orderManager.getRemainingOrders().size());
    }

    @Test
    public void should_get_earlier_order_when_priority_is_same() {
        orderManager.addOrder(new Order("1", "low", LocalDate.now().minusDays(1)));
        orderManager.addOrder(new Order("2", "low", LocalDate.now().minusDays(3)));
        orderManager.addOrder(new Order("3", "low", LocalDate.now().minusDays(2)));

        Order nextOrder = orderManager.allocateNextOrder().get();

        assertEquals("2", nextOrder.getId());
    }

    @Test
    public void should_get_order_by_priority() {
        orderManager.addOrder(new Order("1", "normal", LocalDate.now().minusDays(1)));
        orderManager.addOrder(new Order("2", "rush", LocalDate.now().minusDays(2)));
        orderManager.addOrder(new Order("3", "high", LocalDate.now().minusDays(2)));
        orderManager.addOrder(new Order("4", "low", LocalDate.now().minusDays(3)));
        orderManager.addOrder(new Order("5", "high", LocalDate.now().minusDays(3)));

        Order nextOrder = orderManager.allocateNextOrder().get();

        assertEquals("2", nextOrder.getId());
    }
}
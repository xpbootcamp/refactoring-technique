package cc.xpbootcamp.technique.replace_data_value_with_object;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class OrderServiceTest {

    @Test
    void should_sum_customer_orders_correctly() {
        List<Order> orders = Arrays.asList(new Order("sjyuan"), new Order("sjyuan1"));
        assertThat(OrderService.countCustomerOrders("sjyuan", orders)).isEqualTo(1);
    }

    @Test
    void should_sum_customer_orders_as_0() {
        List<Order> orders = Arrays.asList(new Order("sjyuan3"), new Order("sjyuan1"));
        assertThat(OrderService.countCustomerOrders("sjyuan", orders)).isEqualTo(0);
    }

}
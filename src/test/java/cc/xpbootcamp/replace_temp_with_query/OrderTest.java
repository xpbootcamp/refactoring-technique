package cc.xpbootcamp.replace_temp_with_query;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

class OrderTest {

    @Test
    void should_count_correct_price_when_large_quantity() {
        Order order = new Order(5.5, 59);
        assertThat(order.getPrice()).isEqualTo(308.275);
    }

    @Test
    void should_count_correct_price_when_small_quantity() {
        Order order = new Order(5.5, 5);
        assertThat(order.getPrice()).isEqualTo(26.95);
    }

}
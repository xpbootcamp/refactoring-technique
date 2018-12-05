package cc.xpbootcamp.change_reference_to_data;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CurrencyTest {

    @Test
    void should_get_same_currency() {
        Currency rmb1 = new Currency("RMB");
        Currency rmb2 = new Currency("RMB");

        assertThat(rmb1).isEqualTo(rmb2);
    }

}
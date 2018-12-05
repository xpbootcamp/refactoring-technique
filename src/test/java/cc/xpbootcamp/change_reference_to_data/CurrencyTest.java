package cc.xpbootcamp.change_reference_to_data;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CurrencyTest {

    @Test
    void should_get_same_currency() {
        Currency rmb1 = Currency.get("RMB");
        Currency rmb2 = Currency.get("RMB");

        assertThat(rmb1).isEqualTo(rmb2);
    }

}
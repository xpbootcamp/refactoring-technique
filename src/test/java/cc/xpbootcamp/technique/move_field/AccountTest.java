package cc.xpbootcamp.technique.move_field;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AccountTest {

    @Test
    void should_calculate_correct_interest() {
        double result = new Account(0.15, new AccountType()).interest(10000, 300);
        assertThat(result).isEqualTo(1232.876712328767);
    }

}
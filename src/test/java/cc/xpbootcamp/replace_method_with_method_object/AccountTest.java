package cc.xpbootcamp.replace_method_with_method_object;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AccountTest {

    @Test
    void should_return_correct_gamma() {
        int gamma = new Account().gamma(1, 2, 5);

        assertThat(gamma).isEqualTo(721);
    }
}
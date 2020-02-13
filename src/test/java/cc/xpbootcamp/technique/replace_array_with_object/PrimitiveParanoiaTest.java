package cc.xpbootcamp.technique.replace_array_with_object;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PrimitiveParanoiaTest {

    @Test
    void should_store_correct_data_with_container() {
        Performance performance = new Performance();
        performance.setName("Liverpool");
        performance.setWins("15");

        String name = performance.getName();
        int wins = performance.getWins();

        assertThat(name).isEqualTo("Liverpool");
        assertThat(wins).isEqualTo(15);
    }
}

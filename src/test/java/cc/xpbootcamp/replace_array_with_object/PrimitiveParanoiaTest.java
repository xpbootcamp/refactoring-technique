package cc.xpbootcamp.replace_array_with_object;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PrimitiveParanoiaTest {

    @Test
    void should_store_correct_data_with_container() {
        String[] row = new String[3];
        row[0] = "Liverpool";
        row[1] = "15";

        String name = row[0];
        int wins = Integer.parseInt(row[1]);

        assertThat(name).isEqualTo("Liverpool");
        assertThat(wins).isEqualTo(15);
    }
}

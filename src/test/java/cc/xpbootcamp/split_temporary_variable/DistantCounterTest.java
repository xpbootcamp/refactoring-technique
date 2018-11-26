package cc.xpbootcamp.split_temporary_variable;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DistantCounterTest {

    @Test
    void should_count_correct_distance() {
        double distanceTravelled = new DistantCounter(9.5, 5, 2).getDistanceTravelled(2);

        assertThat(distanceTravelled).isEqualTo(3.8);
    }

}
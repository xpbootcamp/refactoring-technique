package cc.xpbootcamp.technique.replace_nested_conditional_with_guard_clause.sample1;

import cc.xpbootcamp.technique.replace_nested_conditional_with_guard_clause.sample1.Calculator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest {

    @Test
    void should_calculate_correct_result_when_capital_above_zero() {
        Calculator calculator = new Calculator();

        calculator.setCapital(0.4);
        calculator.setIncome(10000);
        calculator.setDuration(1.1);
        calculator.setInitRate(50000);

        assertThat(calculator.getAdjustedCapital()).isEqualTo(10909.090909090908);
    }

    @Test
    void should_calculate_correct_result_when_capital_above_zero_and_init_duration_below_zero() {
        Calculator calculator = new Calculator();

        calculator.setCapital(0.4);
        calculator.setIncome(10000);
        calculator.setDuration(-1.2);
        calculator.setInitRate(50000);

        assertThat(calculator.getAdjustedCapital()).isEqualTo(0);
    }

    @Test
    void should_calculate_correct_result_when_capital_bellow_zero() {
        Calculator calculator = new Calculator();

        calculator.setCapital(-0.4);
        calculator.setIncome(10000);
        calculator.setDuration(1.1);
        calculator.setInitRate(50000);

        assertThat(calculator.getAdjustedCapital()).isEqualTo(0);
    }

}
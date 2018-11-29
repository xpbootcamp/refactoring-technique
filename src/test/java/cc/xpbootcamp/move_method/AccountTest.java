package cc.xpbootcamp.move_method;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AccountTest {

    @Test
    void should_calculate_correct_bank_charge_when_premium() {
        double result = new Account(8, new AccountType(AccountType.TYPE_CODE_PREMIUM)).bankCharge();
        assertThat(result).isEqualTo(15.35);
    }


    @Test
    void should_calculate_correct_bank_charge_when_premium_and_days_below_7() {
        double result = new Account(6, new AccountType(AccountType.TYPE_CODE_PREMIUM)).bankCharge();
        assertThat(result).isEqualTo(9.0);
    }

    @Test
    void should_calculate_correct_bank_charge_when_non_premium() {
        double result = new Account(5, new AccountType("non-premium")).bankCharge();
        assertThat(result).isEqualTo(8.25);
    }
}